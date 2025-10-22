package com.example.mojifilmovi.data

import android.content.Context

interface AppContainer {
    val moviesRepository : MoviesRepository
}

class AppDataContainer(private val context: Context) : AppContainer{
    override val moviesRepository: MoviesRepository by lazy {
        OfflineMoviesRepository(MoviesDatabase.getDatabase(context).movieDao())
    }
}