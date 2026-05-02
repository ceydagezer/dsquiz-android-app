package com.example.myapplication.model

data class Question(
    val id: Int,
    val questionText: String,
    val options: List<String>,
    val correctAnswerIndex: Int,
    val explanation: String,
    val topic: String,
    val category: String,
    val difficulty: String
)
