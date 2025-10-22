package com.example.mojifilmovi.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "movies")
data class Movie(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val rate: Int,
    val genre: String,
    val year: Int
)
