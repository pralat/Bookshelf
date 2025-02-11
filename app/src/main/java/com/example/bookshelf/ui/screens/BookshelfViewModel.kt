package com.example.bookshelf.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bookshelf.network.BookshelfApi
import kotlinx.coroutines.launch
import java.io.IOException

sealed interface BookshelfUiState {
    data class Success(val books: String) : BookshelfUiState
    object Error : BookshelfUiState
    object Loading : BookshelfUiState
}

class BookshelfViewModel : ViewModel() {
    var bookshelfUiState : BookshelfUiState by mutableStateOf(BookshelfUiState.Loading)
        private set

    init {
        getBooks()
    }

    private fun getBooks() {
        viewModelScope.launch {
            /*
             * TODO: take a search string and pass it to the getBooks call.
             */
            bookshelfUiState = try {
                val listResult = BookshelfApi.retrofitService.getBooks("kotlin")
                BookshelfUiState.Success(listResult)
            } catch (e: IOException) {
                BookshelfUiState.Error
            }
        }
    }
}