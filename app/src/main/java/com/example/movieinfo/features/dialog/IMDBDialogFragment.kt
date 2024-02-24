package com.example.movieinfo.features.dialog


import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.compose.ui.res.stringResource
import androidx.navigation.fragment.navArgs
import com.example.movieinfo.BaseDialogFragment
import com.example.movieinfo.R
import com.example.movieinfo.ui.components.dialog.Default
import com.example.movieinfo.ui.components.dialog.DialogPopup
import com.example.movieinfo.ui.models.dialog.DialogButtons
import com.example.movieinfo.ui.theme.MovieInfoTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class IMDBDialogFragment : BaseDialogFragment() {

    private val args: IMDBDialogFragmentArgs by navArgs()

    private val IMDB_BASE_URL = "https://m.imdb.com"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dialog?.apply {
            isCancelable = true
            setCanceledOnTouchOutside(true)
            window?.setBackgroundDrawable(ColorDrawable(requireContext().getColor(R.color.purple_200)))
        }

        return ComposeView(requireContext()).apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                MovieInfoTheme(
                    //themeState = themeViewModel.themeState.collectAsState()
                ) {
                    DialogPopup.Default(
                        title = stringResource(R.string.imdb_title),
                        bodyText = stringResource(R.string.imdb_message),
                        buttons = listOf(
                            DialogButtons.Primary(getString(R.string.open)) {
                                startActivity(
                                    Intent(
                                        Intent.ACTION_VIEW,
                                        Uri.parse(IMDB_BASE_URL + args.url)
                                    )
                                )
                            },
                            DialogButtons.SecondaryBorderless(getString(R.string.cancel)) {
                                dismiss()
                            }
                        )
                    )
                }
            }
        }
    }
}