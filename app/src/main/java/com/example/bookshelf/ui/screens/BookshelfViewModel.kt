package com.example.bookshelf.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bookshelf.network.BookshelfApi
import kotlinx.coroutines.launch

class BookshelfViewModel : ViewModel() {
    var bookshelfUiState : String by mutableStateOf("")
        private set

    init {
        getBooks()
    }

    private fun getBooks() {
        viewModelScope.launch {
            /*
             * TODO: take a search string and pass it to the getBooks call.
             */
            val listResult = BookshelfApi.retrofitService.getBooks("kotlin")
            bookshelfUiState = listResult
        }
    }
}