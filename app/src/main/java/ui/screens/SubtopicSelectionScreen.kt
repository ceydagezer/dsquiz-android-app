package com.example.myapplication.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.components.AppTopBar
import com.example.myapplication.ui.components.topicIcon

@Composable
fun SubtopicSelectionScreen(
    category: String,
    onSubtopicClick: (String) -> Unit = {},
    onBackClick: () -> Unit = {}
) {
    val subtopics = if (category == "Algorithms") {
        listOf(
            "Algorithms" to "All algorithm questions · choose a difficulty",
            "Sorting" to "Bubble, selection, insertion and merge sort · quick quiz",
            "Searching" to "Linear search and binary search · quick quiz",
            "Recursion" to "Recursive logic and base cases · quick quiz",
        )
    } else {
        listOf(
            "Data Structures" to "All data structure questions · choose a difficulty",
            "Arrays" to "Basic array operations and indexing · quick quiz",
            "Linked Lists" to "Nodes, links and traversal · quick quiz",
            "Stacks" to "LIFO structure and stack operations · quick quiz",
            "Queues" to "FIFO structure and queue operations · quick quiz",
            "Trees" to "Tree basics, traversal and hierarchy · quick quiz",
            "Graphs" to "Vertices, edges and graph traversal · quick quiz"
        )
    }

    Scaffold(
        topBar = {
            AppTopBar(title = category, onBackClick = onBackClick)
        }
    ) { padding ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(horizontal = 24.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            item {
                Text(
                    text = "Choose a subtopic to practice.",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.padding(top = 4.dp, bottom = 8.dp)
                )
            }

            items(subtopics) { subtopic ->
                SelectionCard(
                    icon = topicIcon(subtopic.first),
                    title = subtopic.first,
                    subtitle = subtopic.second,
                    onClick = {
                        onSubtopicClick(subtopic.first)
                    }
                )
            }

            item {
                Spacer(modifier = Modifier.height(12.dp))
            }
        }
    }
}
