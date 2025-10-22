package com.example.mojifilmovi.data

import kotlinx.coroutines.flow.Flow

interface MoviesRepository {

    fun getAllMovies(): Flow<List<Movie>>
    fun getMovieStream(id: Int): Flow<Movie?>
    suspend fun insert(movie: Movie)
    suspend fun deleteMovie(movie: Movie)
    suspend fun updateMovie(movie: Movie)
}