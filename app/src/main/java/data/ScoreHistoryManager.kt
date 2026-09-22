package com.example.myapplication.data

import android.content.Context
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.coroutines.flow.Flow

@Entity(tableName = "score_history")
data class ScoreHistoryItem(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val score: Int,
    val totalQuestions: Int,
    val topic: String,
    val difficulty: String,
    val timestamp: Long
)

object ScoreHistoryManager {

    private const val MAX_HISTORY_SIZE = 20

    fun history(context: Context): Flow<List<ScoreHistoryItem>> =
        AppDatabase.getInstance(context).scoreHistoryDao().getAll()

    suspend fun addResult(context: Context, item: ScoreHistoryItem) {
        val dao = AppDatabase.getInstance(context).scoreHistoryDao()
        dao.insert(item)
        dao.trimTo(MAX_HISTORY_SIZE)
    }

    suspend fun clearHistory(context: Context) {
        AppDatabase.getInstance(context).scoreHistoryDao().clearAll()
    }
}
