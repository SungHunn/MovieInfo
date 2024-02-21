package com.example.movieinfo.ui.components.dialog.components.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.movieinfo.ui.components.buttons.PrimaryButton
import com.example.movieinfo.ui.components.buttons.SecondaryBoderlessButton
import com.example.movieinfo.ui.components.buttons.SecondaryButton
import com.example.movieinfo.ui.components.buttons.UnderlinedTextButton
import com.example.movieinfo.ui.models.dialog.DialogButtons
import com.example.movieinfo.ui.theme.Paddings

@Composable
fun DialogButtonsColumn(
    buttons: List<DialogButtons>?
) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        buttons?.forEachIndexed { index, dialogButtons ->
            if (index > 0) {
                Spacer(modifier = Modifier.height(Paddings.large))
            }
            when (dialogButtons) {
                is DialogButtons.Primary -> {
                    PrimaryButton(
                        text = dialogButtons.title,
                        leadingIconData = dialogButtons.leadingIconData
                    ) {
                        dialogButtons.action?.invoke()
                    }
                }

                is DialogButtons.Secondary -> {
                    SecondaryButton(
                        text = dialogButtons.title
                    ) {
                        dialogButtons.action?.invoke()
                    }
                }

                is DialogButtons.UnderlinedText -> {
                    UnderlinedTextButton(
                        text = dialogButtons.title
                    ) {
                        dialogButtons.action?.invoke()
                    }
                }

                is DialogButtons.SecondaryBorderless -> {
                    SecondaryBoderlessButton(
                        text = dialogButtons.title
                    ) {
                        dialogButtons.action?.invoke()
                    }
                }
            }
        }
    }
}