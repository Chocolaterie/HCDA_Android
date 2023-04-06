package com.example.enidemo.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.room.Room
import com.example.enidemo.R

class RoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)

        // Je get la base de données
        val db = Room.inMemoryDatabaseBuilder(this, AppDatabase::class.java).allowMainThreadQueries().build()

        db.articleDAO().insert(Article(0, "Lunette R"))
        db.articleDAO().insert(Article(0, "Le jouet de Raphael"))

        db.articleDAO().getAll().observe(this, Observer {
            println(String.format("ENI-DEMO : %d", it?.size))

            for (article in it){
                println(String.format("ENI-DEMO : %d %s", article.id, article.name))
            }
        })


    }
}