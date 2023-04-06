package com.example.enidemo.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Article::class), version=1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun articleDAO() : ArticleDAO

    companion object{
        var INSTANCE : AppDatabase? = null

        fun getInstance(context: Context) : AppDatabase? {
            synchronized(this) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "DatabaseTest").build()
                }
                return INSTANCE;
            }
        }
    }
}