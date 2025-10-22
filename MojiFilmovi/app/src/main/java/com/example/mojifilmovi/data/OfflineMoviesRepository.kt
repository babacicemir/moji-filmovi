package com.example.mojifilmovi.data

import kotlinx.coroutines.flow.Flow

class OfflineMoviesRepository (private val movieDao: MovieDao) : MoviesRepository {
    override fun getAllMovies(): Flow<List<Movie>> = movieDao.getAllMovies()
    override fun getMovieStream(id: Int): Flow<Movie?> = movieDao.getMovie(id)
    override suspend fun insert(movie: Movie) = movieDao.insert(movie)
    override suspend fun deleteMovie(movie: Movie) = movieDao.delete(movie)
    override suspend fun updateMovie(movie: Movie) = movieDao.update(movie)
}