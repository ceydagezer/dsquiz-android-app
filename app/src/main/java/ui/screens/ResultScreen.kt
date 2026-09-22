package com.example.myapplication.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Replay
import androidx.compose.material.icons.filled.Restore
import androidx.compose.material.icons.filled.SentimentSatisfied
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.myapplication.data.ScoreHistoryItem
import com.example.myapplication.data.ScoreHistoryManager
import com.example.myapplication.data.WrongAnswerManager
import com.example.myapplication.ui.components.IconTile
import com.example.myapplication.ui.components.ScoreRing
import com.example.myapplication.ui.theme.extendedColors

@Composable
fun ResultScreen(
    score: Int,
    totalQuestions: Int,
    topic: String,
    difficulty: String,
    onBackToHomeClick: () -> Unit = {},
    onRetryClick: () -> Unit = {},
    onRetryWrongAnswersClick: () -> Unit = {}
) {
    val context = LocalContext.current

    LaunchedEffect(Unit) {
        ScoreHistoryManager.addResult(
            context,
            ScoreHistoryItem(
                score = score,
                totalQuestions = totalQuestions,
                topic = topic,
                difficulty = difficulty,
                timestamp = System.currentTimeMillis()
            )
        )
    }

    val percentage = if (totalQuestions > 0) {
        (score * 100) / totalQuestions
    } else {
        0
    }

    val extended = MaterialTheme.extendedColors

    val (performanceMessage, performanceIcon, ringColor) = when {
        score == totalQuestions -> Triple("Excellent!", Icons.Filled.EmojiEvents, extended.success)
        percentage >= 70 -> Triple("Good job!", Icons.Filled.ThumbUp, extended.success)
        percentage >= 40 -> Triple("Not bad", Icons.Filled.SentimentSatisfied, extended.warning)
        else -> Triple("Keep practicing", Icons.Filled.Star, extended.error)
    }

    val displayDifficulty = if (difficulty == "Mixed") {
        "Mixed Difficulty"
    } else {
        difficulty
    }

    val hasWrongAnswers = WrongAnswerManager.wrongQuestions.isNotEmpty()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .safeDrawingPadding()
            .verticalScroll(rememberScrollState())
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Quiz Finished",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground
        )

        Text(
            text = "$topic • $displayDifficulty",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.padding(top = 6.dp, bottom = 28.dp)
        )

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(28.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surface
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(28.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                IconTile(
                    icon = performanceIcon,
                    tint = ringColor,
                    size = 52.dp
                )

                Spacer(modifier = Modifier.height(14.dp))

                Text(
                    text = performanceMessage,
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )

                Spacer(modifier = Modifier.height(20.dp))

                ScoreRing(
                    percentage = percentage,
                    ringColor = ringColor
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Score: $score / $totalQuestions",
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = onRetryClick,
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp),
            shape = RoundedCornerShape(18.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
                contentColor = MaterialTheme.colorScheme.onSurfaceVariant
            )
        ) {
            Icon(
                imageVector = Icons.Filled.Replay,
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text("Retry Quiz")
        }

        if (hasWrongAnswers) {
            Spacer(modifier = Modifier.height(12.dp))

            Button(
                onClick = onRetryWrongAnswersClick,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp),
                shape = RoundedCornerShape(18.dp)
            ) {
                Icon(
                    imageVector = Icons.Filled.Restore,
                    contentDescription = null,
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Retry Wrong Answers")
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedButton(
            onClick = onBackToHomeClick,
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp),
            shape = RoundedCornerShape(18.dp)
        ) {
            Text("Back to Home")
        }
    }
}
