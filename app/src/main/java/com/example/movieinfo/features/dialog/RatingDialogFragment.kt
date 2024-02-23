package com.example.movieinfo.features.dialog

import android.R
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.navigation.fragment.navArgs
import com.example.movieinfo.BaseDialogFragment
import com.example.movieinfo.ui.components.dialog.DialogPopup
import com.example.movieinfo.ui.components.dialog.Rating
import com.example.movieinfo.ui.models.buttons.LeadingIconData
import com.example.movieinfo.ui.models.dialog.DialogButtons
import com.example.movieinfo.ui.theme.MovieInfoTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RatingDialogFragment : BaseDialogFragment() {

    private val args: RatingDialogFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dialog?.apply {
            isCancelable = true
            setCanceledOnTouchOutside(true)
            window?.setBackgroundDrawable(ColorDrawable(requireContext().getColor(R.color.transparent)))
        }

        return ComposeView(requireContext()).apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                MovieInfoTheme(
                    //themeState = themeViewModel.themeState.collectAsState()
                ) {
                    DialogPopup.Rating(
                        movieName = args.movieName,
                        rating = args.rating,
                        buttons = listOf(
                            DialogButtons.Primary(
                                title = "Submit",
                                leadingIconData = LeadingIconData(
                                    IconDrawable = R.drawable.ic_menu_send,
                                    iconContentDescription = R.string.copy
                                )
                            ) {
                                dismiss()
                            },
                            DialogButtons.Secondary(getString(R.string.cancel)) {
                                dismiss()
                            }
                        )
                    )
                }
            }
        }
    }
}