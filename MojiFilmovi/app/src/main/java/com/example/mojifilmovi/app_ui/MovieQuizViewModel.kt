package com.example.mojifilmovi.app_ui

import androidx.lifecycle.ViewModel
import com.example.mojifilmovi.data.MovieQuestion
import com.example.mojifilmovi.data.MovieQuestions
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class MovieQuizViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(MoviesQuizUiState())
    val uiState: StateFlow<MoviesQuizUiState> = _uiState

    private val usedIndices = mutableSetOf<Int>()

    private fun getRandomQuestion(): MovieQuestion? {
        if (usedIndices.size >= _uiState.value.totalQuestionsCount || usedIndices.size >= MovieQuestions.size) {
            return null
        }

        var index: Int
        do {
            index = MovieQuestions.indices.random()
        } while (usedIndices.contains(index))

        usedIndices.add(index)
        return MovieQuestions[index]
    }

    fun startQuiz() {
        usedIndices.clear()
        val question = getRandomQuestion()
        _uiState.value = MoviesQuizUiState(
            currentQuestion = question,
            score = 0,
            currentQuestionIndex = 1,
            isAnswerCorrect = false,
            isGameOver = false,
            totalQuestionsCount = 10
        )
    }

    fun submitAnswer(selectedIndex: Int) {
        val current = _uiState.value
        val question = current.currentQuestion ?: return

        val isCorrect = selectedIndex == question.correctAnswerIndex
        val scoreDelta = when {
            isCorrect -> 5
            else -> -3
        }

        _uiState.value = current.copy(
            selectedAnswerIndex = selectedIndex,
            isAnswerCorrect = isCorrect,
            score = current.score + scoreDelta
        )
    }

    fun skipQuestion() {
        _uiState.update { state ->
            state.copy(score = state.score - 2)
        }
        nextQuestion()
    }

    fun nextQuestion() {
        val current = _uiState.value
        if (current.currentQuestionIndex >= current.totalQuestionsCount) {
            _uiState.value = current.copy(isGameOver = true)
            return
        }

        val question = getRandomQuestion()
        if (question == null) {
            _uiState.value = current.copy(isGameOver = true)
        } else {
            _uiState.value = current.copy(
                currentQuestion = question,
                currentQuestionIndex = current.currentQuestionIndex + 1,
                selectedAnswerIndex = null,
                isAnswerCorrect = false
            )
        }
    }


}





