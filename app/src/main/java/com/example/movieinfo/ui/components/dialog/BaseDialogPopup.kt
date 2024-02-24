package com.example.movieinfo.ui.components.dialog


import com.example.movieinfo.ui.models.dialog.DialogTitle
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.movieinfo.ui.components.dialog.components.button.DialogButtonsColumn
import com.example.movieinfo.ui.components.dialog.components.content.DialogContentWrapper
import com.example.movieinfo.ui.components.dialog.components.title.DialogTitleWrapper
import com.example.movieinfo.ui.models.dialog.DialogButtons
import com.example.movieinfo.ui.models.dialog.DialogContent
import com.example.movieinfo.ui.models.dialog.DialogText
import com.example.movieinfo.ui.theme.MovieInfoTheme
import com.example.movieinfo.ui.theme.Paddings

@Composable
fun BaseDialogPopup(
    dialogTitle: DialogTitle? = null,
    dialogContent: DialogContent? = null,
    buttons: List<DialogButtons>? = null
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(Paddings.none),
        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.background),
        shape = MaterialTheme.shapes.large
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            dialogTitle?.let {
                DialogTitleWrapper(it)
            }
            Column(
                modifier = Modifier
                    .background(Color.Transparent)
                    .fillMaxWidth()
                    .padding(
                        start = Paddings.xlarge,
                        end = Paddings.xlarge,
                        bottom = Paddings.xlarge
                    )
            ) {
                dialogContent?.let { DialogContentWrapper(it) }
                buttons?.let { DialogButtonsColumn(it) }
            }
        }
    }
}

@Preview
@Composable
fun BaseDialogPopupPreview() {
    MovieInfoTheme() {
        BaseDialogPopup(
            dialogTitle = DialogTitle.Header("TITLE"),
            dialogContent = DialogContent.Large(
                DialogText.Default("abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde")
            ),
            buttons = listOf(
                DialogButtons.Primary("Okay") {}
            )
        )
    }
}

@Preview
@Composable
fun BaseDialogPopupPreview2() {
    MovieInfoTheme() {
        BaseDialogPopup(
            dialogTitle = DialogTitle.Large("TITLE"),
            dialogContent = DialogContent.Default(
                DialogText.Default("abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde")
            ),
            buttons = listOf(
                DialogButtons.Secondary("Okay") {},
                DialogButtons.UnderlinedText("Cancel") {}
            )
        )
    }
}

@Preview
@Composable
fun BaseDialogPopupPreview3() {
    MovieInfoTheme() {
        BaseDialogPopup(
            dialogTitle = DialogTitle.Large("TITLE"),
            dialogContent = DialogContent.Rating(
                DialogText.Rating(
                    text = "Jurassic Park",
                    rating = 8.2f
                )
            ),
            buttons = listOf(
                DialogButtons.Primary("Okay") {},
                DialogButtons.Secondary("Cancel") {}
            )
        )
    }
}