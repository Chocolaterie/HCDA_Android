package com.example.enidemo.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Article(@PrimaryKey(autoGenerate = true) var id : Long =0L, var name :String) {
}