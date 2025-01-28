
package com.example.bookshelf.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(contentPadding: PaddingValues = PaddingValues(0.dp))
{
    Box(
        contentAlignment = Alignment.Center,
    )
    {
        Text(
            text = "Home",
        )
    }
}