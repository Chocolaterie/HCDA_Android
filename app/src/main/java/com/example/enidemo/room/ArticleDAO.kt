package com.example.enidemo.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.enidemo.Person

@Dao
interface ArticleDAO {

    @Insert
    fun insert(article: Article)

    @Query("SELECT * FROM Article")
    fun getAll() : LiveData<List<Article>>

    @Query("SELECT * FROM Article WHERE id=:id")
    operator fun get(id: Long) : Article
}