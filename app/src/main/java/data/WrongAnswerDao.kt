package com.example.myapplication.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface WrongAnswerDao {

    @Query("SELECT questionId FROM wrong_answers")
    suspend fun getAllIds(): List<Int>

    @Insert
    suspend fun insertAll(items: List<WrongAnswerEntity>)

    @Query("DELETE FROM wrong_answers")
    suspend fun clearAll()
}
