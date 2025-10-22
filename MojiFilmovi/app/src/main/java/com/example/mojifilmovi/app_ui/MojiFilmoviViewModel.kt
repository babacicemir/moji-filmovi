package com.example.mojifilmovi.app_ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mojifilmovi.data.MoviesRepository
import com.example.mojifilmovi.data.Movie
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class MojiFilmoviViewModel(
    private val repository: MoviesRepository) : ViewModel() {

    private val _uiState = MutableStateFlow(MojiFilmoviUiState())
    val uiState: StateFlow<MojiFilmoviUiState> = _uiState

    init {
        viewModelScope.launch {
            repository.getAllMovies().collect { movieList ->
                val filmovi = movieList.map {
                    Movie(
                        id = it.id,
                        name = it.name,
                        genre = it.genre,
                        year = it.year,
                        rate = it.rate
                    )
                }
                _uiState.update { it.copy(filmList = filmovi) }
            }
        }
    }

    fun insertFilm(naziv: String, zanr: String, godina: Int, ocjena: Int) {
        viewModelScope.launch {
            val noviFilm = Movie(
                name = naziv,
                genre = zanr,
                year = godina,
                rate = ocjena
            )
            repository.insert(noviFilm)
        }
    }
}

data class MojiFilmoviUiState(
    val filmList: List<Movie> = emptyList()
)
