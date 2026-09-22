package com.example.myapplication.data

import com.example.myapplication.model.Question

object WrongAnswerManager {
    var wrongQuestions: List<Question> = emptyList()

    fun saveWrongQuestions(questions: List<Question>) {
        wrongQuestions = questions
    }
}
