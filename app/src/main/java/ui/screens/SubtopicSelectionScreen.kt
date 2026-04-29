package com.example.myapplication.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun SubtopicSelectionScreen(
    category: String,
    onSubtopicClick: (String) -> Unit = {},
    onBackClick: () -> Unit = {}
) {
    val subtopics = if (category == "Algorithms") {
        listOf(
            "Algorithms" to "All algorithm questions",
            "Sorting" to "Bubble, selection, insertion and merge sort",
            "Searching" to "Linear search and binary search",
            "Recursion" to "Recursive logic and base cases",
        )
    } else {
        listOf(
            "Data Structures" to "All data structure questions",
            "Arrays" to "Basic array operations and indexing",
            "Linked Lists" to "Nodes, links and traversal",
            "Stacks" to "LIFO structure and stack operations",
            "Queues" to "FIFO structure and queue operations",
            "Trees" to "Tree basics, traversal and hierarchy",
            "Graphs" to "Vertices, edges and graph traversal"
        )
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        item {
            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = category,
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground
            )

            Text(
                text = "Choose a subtopic to practice.",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.padding(top = 8.dp, bottom = 18.dp)
            )
        }

        items(subtopics) { subtopic ->
            SelectionCard(
                title = subtopic.first,
                subtitle = subtopic.second,
                onClick = {
                    onSubtopicClick(subtopic.first)
                }
            )
        }

        item {
            Spacer(modifier = Modifier.height(12.dp))

            OutlinedButton(
                onClick = onBackClick,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp),
                shape = RoundedCornerShape(18.dp)
            ) {
                Text("Back")
            }

            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}
