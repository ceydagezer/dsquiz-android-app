package com.example.myapplication.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.myapplication.data.ScoreHistoryManager
import kotlinx.coroutines.launch
import com.example.myapplication.ui.screens.DifficultySelectionScreen
import com.example.myapplication.ui.screens.HistoryScreen
import com.example.myapplication.ui.screens.HomeScreen
import com.example.myapplication.ui.screens.QuizScreen
import com.example.myapplication.ui.screens.ResultScreen
import com.example.myapplication.ui.screens.SettingsScreen
import com.example.myapplication.ui.screens.TopicSelectionScreen
import com.example.myapplication.ui.screens.SubtopicSelectionScreen

@Composable
fun AppNavigation(
    isDarkMode: Boolean,
    onThemeToggle: () -> Unit
) {
    val navController = rememberNavController()
    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(
                onSettingsClick = {
                    navController.navigate("settings")
                },
                onStartMixedQuizClick = {
                    navController.navigate("difficulty_selection/Mixed")
                },
                onChooseTopicClick = {
                    navController.navigate("topic_selection")
                },
                onScoreHistoryClick = {
                    navController.navigate("history")
                }
            )
        }

        composable("settings") {
            SettingsScreen(
                isDarkMode = isDarkMode,
                onThemeToggle = onThemeToggle,
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }

        composable("topic_selection") {
            TopicSelectionScreen(
                onTopicClick = { selectedTopic ->
                    navController.navigate("subtopic_selection/$selectedTopic")
                },
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }

        composable(
            route = "subtopic_selection/{category}",
            arguments = listOf(
                navArgument("category") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val category = backStackEntry.arguments?.getString("category") ?: "Algorithms"

            SubtopicSelectionScreen(
                category = category,
                onSubtopicClick = { selectedSubtopic ->
                    if (selectedSubtopic == category) {
                        // Whole-category pools are large enough to support difficulty filtering.
                        navController.navigate("difficulty_selection/$selectedSubtopic")
                    } else {
                        // A single subtopic's pool is too small to split by difficulty,
                        // so it always starts a mixed-difficulty quiz directly.
                        navController.navigate("quiz/$selectedSubtopic/Mixed")
                    }
                },
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }

        composable(
            route = "difficulty_selection/{topic}",
            arguments = listOf(
                navArgument("topic") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val topic = backStackEntry.arguments?.getString("topic") ?: "Mixed"

            DifficultySelectionScreen(
                onMixedDifficultyClick = {
                    navController.navigate("quiz/$topic/Mixed")
                },
                onEasyClick = {
                    navController.navigate("quiz/$topic/Easy")
                },
                onMediumClick = {
                    navController.navigate("quiz/$topic/Medium")
                },
                onHardClick = {
                    navController.navigate("quiz/$topic/Hard")
                },
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }

        composable(
            route = "quiz/{topic}/{difficulty}",
            arguments = listOf(
                navArgument("topic") { type = NavType.StringType },
                navArgument("difficulty") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val topic = backStackEntry.arguments?.getString("topic") ?: "Mixed"
            val difficulty = backStackEntry.arguments?.getString("difficulty") ?: "Mixed"

            QuizScreen(
                topic = topic,
                difficulty = difficulty,
                onBackClick = {
                    navController.popBackStack()
                },
                onQuizFinished = { score, totalQuestions, finishedTopic, finishedDifficulty ->
                    navController.navigate(
                        "result/$score/$totalQuestions/$finishedTopic/$finishedDifficulty"
                    )
                }
            )
        }

        composable(
            route = "result/{score}/{totalQuestions}/{topic}/{difficulty}",
            arguments = listOf(
                navArgument("score") { type = NavType.IntType },
                navArgument("totalQuestions") { type = NavType.IntType },
                navArgument("topic") { type = NavType.StringType },
                navArgument("difficulty") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val score = backStackEntry.arguments?.getInt("score") ?: 0
            val totalQuestions = backStackEntry.arguments?.getInt("totalQuestions") ?: 0
            val topic = backStackEntry.arguments?.getString("topic") ?: "Mixed"
            val difficulty = backStackEntry.arguments?.getString("difficulty") ?: "Mixed"

            ResultScreen(
                score = score,
                totalQuestions = totalQuestions,
                topic = topic,
                difficulty = difficulty,
                onBackToHomeClick = {
                    navController.navigate("home") {
                        popUpTo("home") { inclusive = true }
                    }
                },
                onRetryClick = {
                    navController.navigate("quiz/$topic/$difficulty") {
                        popUpTo("result/{score}/{totalQuestions}/{topic}/{difficulty}") { inclusive = true }
                    }
                },
                onRetryWrongAnswersClick = {
                    navController.navigate("quiz/Wrong Answers/Mixed") {
                        popUpTo("result/{score}/{totalQuestions}/{topic}/{difficulty}") { inclusive = true }
                    }
                }
            )
        }

        composable("history") {
            val historyList by ScoreHistoryManager.history(context).collectAsState(initial = emptyList())
            val coroutineScope = rememberCoroutineScope()

            HistoryScreen(
                historyList = historyList,
                onBackClick = {
                    navController.popBackStack()
                },
                onClearHistoryClick = {
                    coroutineScope.launch {
                        ScoreHistoryManager.clearHistory(context)
                    }
                }
            )
        }
    }
}


