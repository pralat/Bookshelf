package com.example.bookshelf.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class BookshelfViewModel : ViewModel() {
    var bookshelfUiState : String by mutableStateOf("")
        private set

    init {
        getBooks()
    }

    fun getBooks() {
        bookshelfUiState = "This is the default"
    }

}