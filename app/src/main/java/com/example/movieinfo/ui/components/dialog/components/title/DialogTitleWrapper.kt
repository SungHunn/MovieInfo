package com.example.movieinfo.ui.components.dialog.components.title

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import com.example.movieinfo.ui.models.dialog.DialogTitle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import com.example.movieinfo.ui.theme.Paddings

@Composable
fun DialogTitleWrapper(title: DialogTitle) {
    when(title) {
        is DialogTitle.Default -> {
            DefaultDialogTitle(title)
        }
        is DialogTitle.Large -> {
            LargeDialogTitle(title)
        }
        is DialogTitle.Header -> {
            HeaderDialogTitle(title)
        }


    }

}

@Composable
fun HeaderDialogTitle(title: DialogTitle.Header) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF465EE9))
            .padding(Paddings.large),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title.text,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineSmall.copy(
                color = Color.White
            )
        )
    }
}

@Composable
fun LargeDialogTitle(title: DialogTitle.Large) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = title.text,
            modifier = Modifier
                .padding(all = Paddings.xlarge)
                .align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.titleLarge,
            color = Color.Black
        )
    }
}

@Composable
fun DefaultDialogTitle(title: DialogTitle.Default) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF465EE9))
            .padding(
                horizontal = Paddings.large,
                vertical = Paddings.extra
            ),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            title.text,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyMedium.copy(
                color = Color.White
            )
        )
    }
}
