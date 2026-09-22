package com.example.myapplication.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.CompareArrows
import androidx.compose.material.icons.automirrored.filled.ManageSearch
import androidx.compose.material.icons.filled.AccountTree
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.material.icons.filled.DataArray
import androidx.compose.material.icons.filled.Functions
import androidx.compose.material.icons.filled.Hub
import androidx.compose.material.icons.filled.Layers
import androidx.compose.material.icons.filled.Link
import androidx.compose.material.icons.filled.Replay
import androidx.compose.material.icons.filled.Shuffle
import androidx.compose.material.icons.filled.SortByAlpha
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.myapplication.ui.theme.extendedColors

/** Picks a representative icon for a topic / subtopic / category label. */
fun topicIcon(topic: String): ImageVector = when (topic) {
    "Algorithms" -> Icons.Filled.Functions
    "Data Structures" -> Icons.Filled.DataArray
    "Arrays" -> Icons.Filled.DataArray
    "Linked Lists" -> Icons.Filled.Link
    "Stacks" -> Icons.Filled.Layers
    "Queues" -> Icons.AutoMirrored.Filled.CompareArrows
    "Trees" -> Icons.Filled.AccountTree
    "Graphs" -> Icons.Filled.Hub
    "Sorting" -> Icons.Filled.SortByAlpha
    "Searching" -> Icons.AutoMirrored.Filled.ManageSearch
    "Recursion" -> Icons.Filled.Replay
    "Wrong Answers" -> Icons.Filled.Replay
    "Mixed" -> Icons.Filled.Shuffle
    else -> Icons.Filled.Bolt
}

@Composable
fun difficultyColor(difficulty: String): Color {
    val extended = MaterialTheme.extendedColors
    return when (difficulty) {
        "Easy" -> extended.easy
        "Medium" -> extended.medium
        "Hard" -> extended.hard
        else -> extended.mixed
    }
}
