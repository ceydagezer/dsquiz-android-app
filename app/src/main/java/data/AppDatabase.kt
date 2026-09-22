package com.example.myapplication.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [ScoreHistoryItem::class, WrongAnswerEntity::class],
    version = 2,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun scoreHistoryDao(): ScoreHistoryDao
    abstract fun wrongAnswerDao(): WrongAnswerDao

    companion object {
        @Volatile
        private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return instance ?: synchronized(this) {
                instance ?: Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "ds_quiz.db"
                )
                    // No migration path is defined between versions yet, so just
                    // recreate the tables — fine for locally cached quiz data.
                    .fallbackToDestructiveMigration(dropAllTables = true)
                    .build().also { instance = it }
            }
        }
    }
}
