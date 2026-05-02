package com.example.myapplication.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.myapplication.data.ScoreHistoryItem
import com.example.myapplication.data.ScoreHistoryManager
import com.example.myapplication.data.WrongAnswerManager

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

    val performanceMessage = when {
        score == totalQuestions -> "Excellent 🎉"
        percentage >= 70 -> "Good job 👍"
        percentage >= 40 -> "Not bad 🙂"
        else -> "Keep practicing 📚"
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
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

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
            shape = RoundedCornerShape(24.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(28.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = performanceMessage,
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = "$percentage%",
                    style = MaterialTheme.typography.displayMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                Spacer(modifier = Modifier.height(8.dp))

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
