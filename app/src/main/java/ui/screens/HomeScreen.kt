package com.example.myapplication.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    isDarkMode: Boolean,
    onThemeToggle: () -> Unit = {},
    onSettingsClick: () -> Unit = {},
    onStartMixedQuizClick: () -> Unit = {},
    onChooseTopicClick: () -> Unit = {},
    onScoreHistoryClick: () -> Unit = {}
) {

    Scaffold(
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalArrangement = Arrangement.End
            ) {
                OutlinedButton(onClick = onSettingsClick) {
                    Text("Settings")
                }
            }
        }
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(horizontal = 24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "DS Quiz",
                style = MaterialTheme.typography.displaySmall,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Practice algorithms and data structures with quick quizzes.",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.padding(top = 8.dp, bottom = 36.dp)
            )

            HomeCard(
                title = "Start Mixed Quiz",
                subtitle = "Random questions from all topics",
                onClick = onStartMixedQuizClick
            )

            Spacer(modifier = Modifier.height(16.dp))

            HomeCard(
                title = "Choose Topic",
                subtitle = "Practice a specific subject",
                onClick = onChooseTopicClick
            )

            Spacer(modifier = Modifier.height(16.dp))

            HomeCard(
                title = "Score History",
                subtitle = "Review your previous results",
                onClick = onScoreHistoryClick
            )
        }
    }
}


@Composable
fun HomeCard(
    title: String,
    subtitle: String,
    onClick: () -> Unit
) {

    Card(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {

            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.SemiBold
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = subtitle,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}