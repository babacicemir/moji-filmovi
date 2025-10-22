package com.example.mojifilmovi.app_ui

import com.example.mojifilmovi.data.MovieQuestion

data class MoviesQuizUiState (
    val currentQuestion: MovieQuestion? = null,
    val score: Int = 0,
    val currentQuestionIndex: Int = 0,
    val isAnswerCorrect: Boolean? = null,
    val isGameOver: Boolean = false,
    val totalQuestionsCount: Int = 10,
    val selectedAnswerIndex: Int? = null
)