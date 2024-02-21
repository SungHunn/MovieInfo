package com.example.movieinfo.ui.components.dialog

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.movieinfo.R
import com.example.movieinfo.ui.models.buttons.LeadingIconData
import com.example.movieinfo.ui.models.dialog.DialogButtons
import com.example.movieinfo.ui.theme.MovieInfoTheme

@Preview
@Composable
fun AlertPreview() {
    MovieInfoTheme() {
        DialogPopup.Alert(
            title = "Title",
            bodyText = "blah balh blah",
            buttons = listOf(
                DialogButtons.UnderlinedText("Okay") {}
            )
        )
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MovieInfoTheme {
        DialogPopup.Default(
            title = "Title",
            bodyText = "blah balh blah",
            buttons = listOf(
                DialogButtons.Primary("OPEN") {},
                DialogButtons.SecondaryBorderless("CANCEL") {}
            )
        )
    }
}

@Preview
@Composable
fun RatingPreview() {
    MovieInfoTheme {
        DialogPopup.Rating(
            movieName = "The Lord of the Rings: The Two Towers",
            rating = 7.5f,
            buttons = listOf(
                DialogButtons.Primary(
                    title = "OPEN",
                    leadingIconData = LeadingIconData(
                        IconDrawable = R.drawable.baseline_send_24,
                        iconContentDescription = null
                    )
                ) {},
                DialogButtons.SecondaryBorderless("CANCEL") {}
            )
        )
    }
}