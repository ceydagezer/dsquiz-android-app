package com.example.myapplication.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.myapplication.data.QuestionRepository
import com.example.myapplication.model.Question

@Composable
fun QuizScreen(
    topic: String,
    difficulty: String,
    onQuizFinished: (Int, Int, String, String) -> Unit = { _, _, _, _ -> }
) {
    val questions: List<Question> = remember(topic, difficulty) {
        val filteredQuestions =
            if (topic == "Mixed") {
                QuestionRepository.questions.filter { it.difficulty == difficulty }
            } else {
                QuestionRepository.questions.filter {
                    it.topic == topic && it.difficulty == difficulty
                }
            }

        filteredQuestions.shuffled()
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

    var currentQuestionIndex by remember { mutableStateOf(0) }
    var selectedAnswerIndex by remember { mutableStateOf<Int?>(null) }
    var isAnswerChecked by remember { mutableStateOf(false) }
    var showExplanation by remember { mutableStateOf(false) }
    var score by remember { mutableStateOf(0) }

    val question = questions[currentQuestionIndex]

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(24.dp),
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Quiz",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground
        )

        Text(
            text = "$topic • $difficulty",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.padding(top = 4.dp, bottom = 24.dp)
        )

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(22.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
        ) {
            Column(
                modifier = Modifier.padding(20.dp)
            ) {
                Text(
                    text = "Question ${currentQuestionIndex + 1} / ${questions.size}",
                    style = MaterialTheme.typography.titleSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                Spacer(modifier = Modifier.height(8.dp))

                LinearProgressIndicator(
                    progress = (currentQuestionIndex + 1).toFloat() / questions.size.toFloat(),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(6.dp),
                    color = MaterialTheme.colorScheme.primary,
                    trackColor = MaterialTheme.colorScheme.surfaceVariant
                )

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = question.questionText,
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        question.options.forEachIndexed { index, option ->

            val containerColor = when {
                isAnswerChecked && index == question.correctAnswerIndex ->
                    Color(0xFF4CAF50)

                isAnswerChecked &&
                        index == selectedAnswerIndex &&
                        index != question.correctAnswerIndex ->
                    Color(0xFFF44336)

                else ->
                    MaterialTheme.colorScheme.surfaceVariant
            }

            val contentColor = if (
                isAnswerChecked &&
                (index == question.correctAnswerIndex || index == selectedAnswerIndex)
            ) {
                Color.White
            } else {
                MaterialTheme.colorScheme.onSurfaceVariant
            }

            Button(
                onClick = {
                    if (!isAnswerChecked) {
                        selectedAnswerIndex = index
                        isAnswerChecked = true

                        if (index == question.correctAnswerIndex) {
                            score++
                        }
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 6.dp)
                    .height(52.dp),
                shape = RoundedCornerShape(18.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = containerColor,
                    contentColor = contentColor
                )
            ) {
                Text(option)
            }
        }

        if (isAnswerChecked && selectedAnswerIndex != null) {
            Spacer(modifier = Modifier.height(20.dp))

            val isCorrect = selectedAnswerIndex == question.correctAnswerIndex

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant
                )
            ) {
                Column(
                    modifier = Modifier.padding(18.dp)
                ) {
                    Text(
                        text = if (isCorrect) "Correct!" else "Wrong!",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    OutlinedButton(
                        onClick = {
                            showExplanation = !showExplanation
                        },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Text(
                            text = if (showExplanation) {
                                "Hide Explanation"
                            } else {
                                "Show Explanation"
                            }
                        )
                    }

                    if (showExplanation) {
                        Spacer(modifier = Modifier.height(12.dp))

                        Text(
                            text = question.explanation,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {
                    if (currentQuestionIndex < questions.lastIndex) {
                        currentQuestionIndex++
                        selectedAnswerIndex = null
                        isAnswerChecked = false
                        showExplanation = false
                    } else {
                        onQuizFinished(score, questions.size, topic, difficulty)
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp),
                shape = RoundedCornerShape(18.dp)
            ) {
                Text(
                    text = if (currentQuestionIndex < questions.lastIndex) {
                        "Next Question"
                    } else {
                        "See Result"
                    }
                )
            }
        }
    }
}