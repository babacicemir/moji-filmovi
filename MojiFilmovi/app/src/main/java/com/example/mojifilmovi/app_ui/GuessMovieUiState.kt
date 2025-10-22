package com.example.mojifilmovi.app_ui

data class GuessMovieUiState(
    val currentMovieWord: String = "",
    val isGuessedWordWrong: Boolean = false,
    val score: Int = 0,
    val currentWordCount: Int = 0,
    val isGameOver: Boolean = false,
    val  totalWordsCount: Int = 10
)