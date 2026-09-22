package com.example.myapplication.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.components.AppTopBar
import com.example.myapplication.ui.components.difficultyColor

@Composable
fun DifficultySelectionScreen(
    onMixedDifficultyClick: () -> Unit = {},
    onEasyClick: () -> Unit = {},
    onMediumClick: () -> Unit = {},
    onHardClick: () -> Unit = {},
    onBackClick: () -> Unit = {}
) {
    Scaffold(
        topBar = {
            AppTopBar(title = "Choose Difficulty", onBackClick = onBackClick)
        }
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(horizontal = 24.dp)
        ) {

            Text(
                text = "Select the level you want to practice.",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.padding(top = 4.dp, bottom = 24.dp)
            )

            DifficultyCard(
                title = "Mixed Difficulty",
                subtitle = "All difficulty levels mixed together",
                onClick = onMixedDifficultyClick
            )

            Spacer(modifier = Modifier.height(14.dp))

            DifficultyCard(
                title = "Easy",
                subtitle = "Basic concepts and beginner-friendly questions",
                onClick = onEasyClick
            )

            Spacer(modifier = Modifier.height(14.dp))

            DifficultyCard(
                title = "Medium",
                subtitle = "More detailed questions for regular practice",
                onClick = onMediumClick
            )

            Spacer(modifier = Modifier.height(14.dp))

            DifficultyCard(
                title = "Hard",
                subtitle = "Challenging questions for deeper understanding",
                onClick = onHardClick
            )
        }
    }
}

@Composable
private fun DifficultyCard(
    title: String,
    subtitle: String,
    onClick: () -> Unit
) {
    val accent = difficultyColor(title.substringBefore(" "))

    Card(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(22.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(12.dp)
                    .background(accent, CircleShape)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold
                )

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = subtitle,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }

            Icon(
                imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}
