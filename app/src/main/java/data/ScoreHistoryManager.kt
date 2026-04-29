package com.example.myapplication.data

import android.content.Context
import androidx.compose.runtime.mutableStateListOf
import org.json.JSONArray
import org.json.JSONObject

data class ScoreHistoryItem(
    val score: Int,
    val totalQuestions: Int,
    val topic: String,
    val difficulty: String,
    val timestamp: Long
)

object ScoreHistoryManager {

    val history = mutableStateListOf<ScoreHistoryItem>()

    private const val PREF_NAME = "score_history_pref"
    private const val HISTORY_KEY = "history_list"

    fun loadHistory(context: Context) {
        history.clear()

        val sharedPreferences =
            context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)

        val jsonString =
            sharedPreferences.getString(HISTORY_KEY, null) ?: return

        val jsonArray = JSONArray(jsonString)

        for (i in 0 until jsonArray.length()) {
            val item = jsonArray.getJSONObject(i)

            history.add(
                ScoreHistoryItem(
                    score = item.getInt("score"),
                    totalQuestions = item.getInt("totalQuestions"),
                    topic = item.getString("topic"),
                    difficulty = item.getString("difficulty"),
                    timestamp = item.optLong("timestamp", System.currentTimeMillis())
                )
            )
        }
    }

    fun addResult(context: Context, item: ScoreHistoryItem) {
        history.add(0, item)

        if (history.size > 20) {
            history.removeAt(history.lastIndex)
        }

        saveHistory(context)
    }

    fun clearHistory(context: Context) {
        history.clear()

        val sharedPreferences =
            context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)

        sharedPreferences.edit()
            .remove(HISTORY_KEY)
            .apply()
    }

    private fun saveHistory(context: Context) {
        val jsonArray = JSONArray()

        history.forEach {
            val jsonObject = JSONObject()

            jsonObject.put("score", it.score)
            jsonObject.put("totalQuestions", it.totalQuestions)
            jsonObject.put("topic", it.topic)
            jsonObject.put("difficulty", it.difficulty)
            jsonObject.put("timestamp", it.timestamp)

            jsonArray.put(jsonObject)
        }

        val sharedPreferences =
            context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)

        sharedPreferences.edit()
            .putString(HISTORY_KEY, jsonArray.toString())
            .apply()
    }
}
