package com.example.myapplication.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ScoreHistoryDao {

    @Query("SELECT * FROM score_history ORDER BY timestamp DESC")
    fun getAll(): Flow<List<ScoreHistoryItem>>

    @Insert
    suspend fun insert(item: ScoreHistoryItem)

    @Query(
        "DELETE FROM score_history WHERE id NOT IN " +
            "(SELECT id FROM score_history ORDER BY timestamp DESC LIMIT :keepCount)"
    )
    suspend fun trimTo(keepCount: Int)

    @Query("DELETE FROM score_history")
    suspend fun clearAll()
}
