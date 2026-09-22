package com.example.myapplication.model

data class Question(
    val id: Int,
    val questionText: String,
    val options: List<String>,
    val correctAnswerIndex: Int,
    val explanation: String,
    /** Per-option explanation, index-aligned with [options], covering why each choice is right or wrong. */
    val optionExplanations: List<String>,
    val topic: String,
    val category: String,
    val difficulty: String
)
