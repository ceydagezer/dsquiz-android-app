package com.example.myapplication.data

data class ScoreHistoryItem(
    val score: Int,
    val totalQuestions: Int,
    val topic: String,
    val difficulty: String
)
object ScoreHistoryManager {
    val history = mutableListOf<ScoreHistoryItem>()
}

