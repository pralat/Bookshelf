
package com.example.bookshelf.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    bookshelfUiState: BookshelfUiState,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp)
) {
    Box(
        contentAlignment = Alignment.Center,
    )
    {
        /*
         * TODO: prompt user for the search string and pass it to the viewmodel for
         * the getBooks call.
         */
        when (bookshelfUiState) {
            is BookshelfUiState.Success ->
                Text(
                    text = bookshelfUiState.books,
                )
            is BookshelfUiState.Loading ->
                Text(
                    text = "Loading...",
                )
            is BookshelfUiState.Error ->
                Text(
                    text = "Error...",
                )
        }
    }
}