package com.example.myapplication.data

import android.content.Context
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wrong_answers")
data class WrongAnswerEntity(
    @PrimaryKey val questionId: Int
)

object WrongAnswerManager {

    suspend fun wrongQuestionIds(context: Context): List<Int> =
        AppDatabase.getInstance(context).wrongAnswerDao().getAllIds()

    suspend fun saveWrongQuestionIds(context: Context, questionIds: List<Int>) {
        val dao = AppDatabase.getInstance(context).wrongAnswerDao()
        dao.clearAll()
        dao.insertAll(questionIds.map { WrongAnswerEntity(it) })
    }
}
