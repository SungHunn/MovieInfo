package com.example.movieinfo.ui.models.dialog

import com.example.movieinfo.ui.models.buttons.LeadingIconData

sealed class DialogButtons(
    open val title: String,
    open val action: (() -> Unit)?
) {
    data class Primary(
        override val title: String,
        val leadingIconData: LeadingIconData? = null,
        override val action: (() -> Unit)? = null
    ) : DialogButtons(title, action)

    data class Secondary(
        override val title: String,
        override val action: (() -> Unit)? = null
    ) : DialogButtons(title, action)

    data class UnderlinedText(
        override val title: String,
        override val action: (() -> Unit)? = null
    ) : DialogButtons(title, action)

    data class SecondaryBorderless(
        override val title: String,
        override val action: (() -> Unit)? = null
    ) : DialogButtons(title, action)
}