package com.example.myapplication.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun DifficultySelectionScreen(
    onMixedDifficultyClick: () -> Unit = {},
    onEasyClick: () -> Unit = {},
    onMediumClick: () -> Unit = {},
    onHardClick: () -> Unit = {},
    onBackClick: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Choose Difficulty",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground
        )

        Text(
            text = "Select the level you want to practice.",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.padding(top = 8.dp, bottom = 32.dp)
        )

        SelectionCard(
            title = "Mixed Difficulty",
            subtitle = "All difficulty levels mixed together",
            onClick = onMixedDifficultyClick
        )

        Spacer(modifier = Modifier.height(16.dp))

        SelectionCard(
            title = "Easy",
            subtitle = "Basic concepts and beginner-friendly questions",
            onClick = onEasyClick
        )

        Spacer(modifier = Modifier.height(16.dp))

        SelectionCard(
            title = "Medium",
            subtitle = "More detailed questions for regular practice",
            onClick = onMediumClick
        )

        Spacer(modifier = Modifier.height(16.dp))

        SelectionCard(
            title = "Hard",
            subtitle = "Challenging questions for deeper understanding",
            onClick = onHardClick
        )

        Spacer(modifier = Modifier.height(32.dp))

        OutlinedButton(
            onClick = onBackClick,
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp),
            shape = RoundedCornerShape(18.dp)
        ) {
            Text("Back")
        }
    }
}
