package com.example.mojifilmovi.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Movie::class], version = 1, exportSchema = false)
abstract class MoviesDatabase : RoomDatabase() {
    abstract fun movieDao() : MovieDao
    companion object {
        @Volatile
        private var Instance: MoviesDatabase? = null
        fun getDatabase(context: Context) : MoviesDatabase{
            return Instance ?: synchronized(this){
                Room.databaseBuilder(context, MoviesDatabase::class.java, "movie_database")
                    .build()
                    .also { Instance = it }
            }
        }
    }

}