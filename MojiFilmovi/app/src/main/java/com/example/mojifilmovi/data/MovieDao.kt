package com.example.mojifilmovi.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface MovieDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(movie: Movie)
    @Delete
    suspend fun delete(movie: Movie)
    @Update
    suspend fun update(movie: Movie)
    @Query("SELECT * from movies WHERE id = :id")
    fun getMovie(id: Int): Flow<Movie>

    @Query("SELECT * from movies ORDER BY name ASC")
    fun getAllMovies(): Flow<List<Movie>>
}