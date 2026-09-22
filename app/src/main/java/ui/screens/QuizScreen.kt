package com.example.myapplication.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.draw.clip
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.myapplication.data.QuestionRepository
import com.example.myapplication.data.WrongAnswerManager
import com.example.myapplication.model.Question
import com.example.myapplication.ui.components.AppTopBar
import com.example.myapplication.ui.components.ExplanationOverlay
import com.example.myapplication.ui.theme.extendedColors

@Composable
fun QuizScreen(
    topic: String,
    difficulty: String,
    onBackClick: () -> Unit = {},
    onQuizFinished: (Int, Int, String, String) -> Unit = { _, _, _, _ -> }
) {
    val questions: List<Question> = remember(topic, difficulty) {
        val filteredQuestions = QuestionRepository.questions.filter { question ->

            val matchesTopic = when (topic) {
                "Data Structures" -> question.category == "Data Structures"
                "Algorithms" -> question.category == "Algorithms"
                "Mixed" -> true
                "Wrong Answers" -> true
                else -> question.topic == topic
            }

            val matchesDifficulty = when (difficulty) {
                "Mixed" -> true
                else -> question.difficulty == difficulty
            }

            matchesTopic && matchesDifficulty
        }

        val pool = if (topic == "Wrong Answers") {
            WrongAnswerManager.wrongQuestions
        } else {
            filteredQuestions
        }

        pool.shuffled().take(QuestionRepository.QUIZ_LENGTH)
    }

    if (questions.isEmpty()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(24.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "No questions found.",
                color = MaterialTheme.colorScheme.onBackground
            )
        }
        return
    }

    var currentQuestionIndex by remember(topic, difficulty) { mutableIntStateOf(0) }
    var selectedAnswerOriginalIndex by remember(topic, difficulty) { mutableStateOf<Int?>(null) }
    var isAnswerChecked by remember(topic, difficulty) { mutableStateOf(false) }
    var showExplanationOverlay by remember(topic, difficulty) { mutableStateOf(false) }
    var score by remember(topic, difficulty) { mutableIntStateOf(0) }
    var showExitDialog by remember { mutableStateOf(false) }
    val wrongQuestions = remember(topic, difficulty) { mutableStateListOf<Question>() }

    val question = questions[currentQuestionIndex]

    val shuffledOptions = remember(question.id) {
        question.options.mapIndexed { index, option ->
            index to option
        }.shuffled()
    }

    val optionLetters = listOf("A", "B", "C", "D", "E", "F")

    val displayDifficulty = if (difficulty == "Mixed") {
        "Mixed Difficulty"
    } else {
        difficulty
    }

    Scaffold(
        topBar = {
            AppTopBar(
                title = "$topic • $displayDifficulty",
                actions = {
                    TextButton(onClick = { showExitDialog = true }) {
                        Icon(
                            imageVector = Icons.Filled.Close,
                            contentDescription = "Exit quiz",
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }
            )
        }
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 24.dp),
            verticalArrangement = Arrangement.Top
        ) {

            Text(
                text = "Question ${currentQuestionIndex + 1} of ${questions.size}",
                style = MaterialTheme.typography.titleSmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            Spacer(modifier = Modifier.height(8.dp))

            val animatedProgress by animateFloatAsState(
                targetValue = (currentQuestionIndex + 1).toFloat() / questions.size.toFloat(),
                label = "quizProgress"
            )

            LinearProgressIndicator(
                progress = { animatedProgress },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(6.dp)
                    .clip(RoundedCornerShape(3.dp)),
                color = MaterialTheme.colorScheme.primary,
                trackColor = MaterialTheme.colorScheme.surfaceVariant
            )

            Spacer(modifier = Modifier.height(20.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(22.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            ) {
                Text(
                    text = question.questionText,
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(20.dp)
                )
            }

            Spacer(modifier = Modifier.height(18.dp))

            val extended = MaterialTheme.extendedColors

            shuffledOptions.forEachIndexed { position, optionPair ->
                val originalIndex = optionPair.first
                val option = optionPair.second

                val isCorrectOption = originalIndex == question.correctAnswerIndex
                val isSelectedOption = originalIndex == selectedAnswerOriginalIndex

                val containerColor = when {
                    isAnswerChecked && isCorrectOption -> extended.successContainer
                    isAnswerChecked && isSelectedOption && !isCorrectOption -> extended.errorContainer
                    else -> MaterialTheme.colorScheme.surface
                }

                val borderColor = when {
                    isAnswerChecked && isCorrectOption -> extended.success
                    isAnswerChecked && isSelectedOption && !isCorrectOption -> extended.error
                    else -> Color.Transparent
                }

                val badgeColor = when {
                    isAnswerChecked && isCorrectOption -> extended.success
                    isAnswerChecked && isSelectedOption && !isCorrectOption -> extended.error
                    else -> MaterialTheme.colorScheme.surfaceVariant
                }

                val badgeTextColor = when {
                    isAnswerChecked && (isCorrectOption || isSelectedOption) -> Color.White
                    else -> MaterialTheme.colorScheme.onSurfaceVariant
                }

                OptionRow(
                    letter = optionLetters.getOrElse(position) { "" },
                    text = option,
                    containerColor = containerColor,
                    borderColor = borderColor,
                    badgeColor = badgeColor,
                    badgeTextColor = badgeTextColor,
                    trailingIcon = when {
                        isAnswerChecked && isCorrectOption -> Icons.Filled.CheckCircle
                        isAnswerChecked && isSelectedOption && !isCorrectOption -> Icons.Filled.Cancel
                        else -> null
                    },
                    trailingIconTint = when {
                        isAnswerChecked && isCorrectOption -> extended.success
                        else -> extended.error
                    },
                    enabled = !isAnswerChecked,
                    onClick = {
                        selectedAnswerOriginalIndex = originalIndex
                        isAnswerChecked = true

                        if (originalIndex == question.correctAnswerIndex) {
                            score++
                        } else {
                            if (!wrongQuestions.contains(question)) {
                                wrongQuestions.add(question)
                            }
                        }
                    }
                )

                Spacer(modifier = Modifier.height(10.dp))
            }

            AnimatedVisibility(
                visible = isAnswerChecked && selectedAnswerOriginalIndex != null,
                enter = fadeIn() + expandVertically(),
                exit = fadeOut() + shrinkVertically()
            ) {
                val isCorrect = selectedAnswerOriginalIndex == question.correctAnswerIndex

                Column {
                    Spacer(modifier = Modifier.height(10.dp))

                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(20.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = if (isCorrect) extended.successContainer else extended.errorContainer
                        )
                    ) {
                        Column(
                            modifier = Modifier.padding(18.dp)
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = if (isCorrect) Icons.Filled.CheckCircle else Icons.Filled.Cancel,
                                    contentDescription = null,
                                    tint = if (isCorrect) extended.success else extended.error
                                )

                                Spacer(modifier = Modifier.width(8.dp))

                                Text(
                                    text = if (isCorrect) "Correct!" else "Wrong!",
                                    style = MaterialTheme.typography.titleMedium,
                                    fontWeight = FontWeight.Bold,
                                    color = if (isCorrect) extended.success else extended.error
                                )
                            }

                            Spacer(modifier = Modifier.height(12.dp))

                            OutlinedButton(
                                onClick = { showExplanationOverlay = true },
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(16.dp)
                            ) {
                                Text("Show Explanation")
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        onClick = {
                            if (currentQuestionIndex < questions.lastIndex) {
                                currentQuestionIndex++
                                selectedAnswerOriginalIndex = null
                                isAnswerChecked = false
                                showExplanationOverlay = false
                            } else {
                                WrongAnswerManager.saveWrongQuestions(wrongQuestions.toList())
                                onQuizFinished(score, questions.size, topic, difficulty)
                            }
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(52.dp),
                        shape = RoundedCornerShape(18.dp)
                    ) {
                        Text(
                            text = if (currentQuestionIndex < questions.lastIndex) "Next Question" else "See Result"
                        )
                    }

                    Spacer(modifier = Modifier.height(24.dp))
                }
            }
        }
    }

    if (showExitDialog) {
        AlertDialog(
            onDismissRequest = {
                showExitDialog = false
            },
            title = {
                Text("Leave quiz?")
            },
            text = {
                Text("Your progress will not be saved.")
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        showExitDialog = false
                        onBackClick()
                    }
                ) {
                    Text("Leave")
                }
            },
            dismissButton = {
                TextButton(
                    onClick = {
                        showExitDialog = false
                    }
                ) {
                    Text("Cancel")
                }
            }
        )
    }

    if (showExplanationOverlay) {
        ExplanationOverlay(
            question = question,
            optionOrder = shuffledOptions.map { it.first },
            optionLetters = optionLetters,
            selectedIndex = selectedAnswerOriginalIndex,
            onClose = { showExplanationOverlay = false }
        )
    }
}

@Composable
private fun OptionRow(
    letter: String,
    text: String,
    containerColor: Color,
    borderColor: Color,
    badgeColor: Color,
    badgeTextColor: Color,
    trailingIcon: ImageVector?,
    trailingIconTint: Color,
    enabled: Boolean,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(18.dp))
            .background(containerColor)
            .border(1.5.dp, borderColor, RoundedCornerShape(18.dp))
            .then(
                if (enabled) {
                    Modifier.clickable(onClick = onClick)
                } else {
                    Modifier
                }
            )
            .padding(horizontal = 16.dp, vertical = 14.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(30.dp)
                .background(badgeColor, CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = letter,
                style = MaterialTheme.typography.labelLarge,
                color = badgeTextColor
            )
        }

        Spacer(modifier = Modifier.width(14.dp))

        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onSurface,
            modifier = Modifier.weight(1f)
        )

        if (trailingIcon != null) {
            Spacer(modifier = Modifier.width(8.dp))
            Icon(
                imageVector = trailingIcon,
                contentDescription = null,
                tint = trailingIconTint
            )
        }
    }
}
