package com.example.bookshelf.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.bookshelf.ui.screens.BookshelfViewModel
import com.example.bookshelf.ui.screens.HomeScreen
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun BookshelfApp() {
    Scaffold(

    ) {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {

            val bookshelfViewModel: BookshelfViewModel = viewModel()
            HomeScreen(
                bookshelfUiState = bookshelfViewModel.bookshelfUiState,
                contentPadding = it
            )
        }
    }
}