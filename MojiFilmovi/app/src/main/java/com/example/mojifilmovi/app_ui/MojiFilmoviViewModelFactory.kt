package com.example.mojifilmovi.app_ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mojifilmovi.data.MoviesRepository

class MojiFilmoviViewModelFactory (private val repository: MoviesRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MojiFilmoviViewModel::class.java)) {
            return MojiFilmoviViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}