package com.example.movieinfo.ui.components.movie

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.movieinfo.ui.theme.MovieInfoTheme
import com.example.movieinfo.ui.theme.Paddings

@Composable
fun CategoryRow() {
    Column(
        modifier = Modifier.background(Color.LightGray)
    ) {
        CategoryTitle("Action")
        LazyRow(
            contentPadding = PaddingValues(
                horizontal = Paddings.large
            )
        ) {
            item {
                MovieItem()
            }
            item {
                MovieItem()
            }
            item {
                MovieItem()
            }

        }
    }
}

@Composable
fun CategoryTitle(title: String) {
    Text(
        text = title,
        modifier = Modifier.padding(Paddings.large),
        style = MaterialTheme.typography.titleLarge
    )
}


@Preview
@Composable
fun CategoryPreview() {
    MovieInfoTheme() {
        CategoryRow()
    }

}