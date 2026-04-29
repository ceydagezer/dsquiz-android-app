package com.example.myapplication.data

import com.example.myapplication.model.Question

object QuestionRepository {

    val questions = listOf(
        Question(
            id = 1,
            questionText = "What is the time complexity of binary search?",
            options = listOf("O(n)", "O(log n)", "O(n^2)", "O(1)"),
            correctAnswerIndex = 1,
            explanation = "Binary search halves the search space at each step, so it is O(log n).",
            topic = "Algorithms",
            difficulty = "Easy"
        ),
        Question(
            id = 2,
            questionText = "Which data structure uses FIFO logic?",
            options = listOf("Stack", "Queue", "Tree", "Graph"),
            correctAnswerIndex = 1,
            explanation = "Queue uses First In First Out logic.",
            topic = "Data Structures",
            difficulty = "Easy"
        )
    )
}