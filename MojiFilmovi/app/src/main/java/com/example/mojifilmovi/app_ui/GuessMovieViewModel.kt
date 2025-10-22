package com.example.mojifilmovi.app_ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.mojifilmovi.data.allMovies
import com.example.mojifilmovi.data.max_no_of_words
import com.example.mojifilmovi.data.score_increase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class GuessMovieViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(GuessMovieUiState())
    val uiState: StateFlow<GuessMovieUiState> = _uiState.asStateFlow()

    var userGuess by mutableStateOf("")
        private set

    private var usedWords: MutableSet<String> = mutableSetOf()
    private lateinit var currentWord: String

    private fun shuffleCurrentWord(word: String): String {
        val tempWord = word.toCharArray()
        tempWord.shuffle()
        while (String(tempWord).equals(word, ignoreCase = true)) {
            tempWord.shuffle()
        }
        return String(tempWord)
    }

    private fun pickRandomWordAndShuffle(): String {
        currentWord = allMovies.random()
        return if (usedWords.contains(currentWord)) {
            pickRandomWordAndShuffle()
        } else {
            usedWords.add(currentWord)
            shuffleCurrentWord(currentWord)
        }
    }

    fun updateUserGuess(guessedWord: String) {
        userGuess = guessedWord
    }

    private fun updateGameState(updatedScore: Int) {
        if (usedWords.size == max_no_of_words) {
            _uiState.update { currentState ->
                currentState.copy(
                    isGuessedWordWrong = false,
                    score = updatedScore,
                    isGameOver = true
                )
            }
        } else {
            _uiState.update { currentState ->
                currentState.copy(
                    isGuessedWordWrong = false,
                    currentMovieWord = pickRandomWordAndShuffle(),
                    score = updatedScore,
                    currentWordCount = currentState.currentWordCount.inc()
                )
            }
        }
    }

    fun skipWord() {
        val updatedScore = _uiState.value.score - 3
        updateGameState(updatedScore)
        updateUserGuess("")
    }

    fun checkUserGuess() {
        if (userGuess.equals(currentWord, ignoreCase = true)) {
            val updatedScore = _uiState.value.score + score_increase
            updateGameState(updatedScore)
        } else {
            val updatedScore = _uiState.value.score - 5
            _uiState.update { currentState ->
                currentState.copy(
                    isGuessedWordWrong = true,
                    score = updatedScore
                )
            }
        }
        updateUserGuess("")
    }

    fun resetGame() {
        usedWords.clear()
        _uiState.value = GuessMovieUiState(currentMovieWord = pickRandomWordAndShuffle())
    }

    init {
        resetGame()
    }
}
