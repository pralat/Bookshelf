package com.example.bookshelf.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.bookshelf.ui.screens.HomeScreen

@Composable
fun BookshelfApp() {
    Scaffold(

    ) {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {

//        val bookshelfViewModel: BookshelfViewModel = viewModel()
            HomeScreen(
            contentPadding = it
            )
        }
    }
}