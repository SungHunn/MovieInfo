package com.example.movieinfo

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.activityViewModels
import com.example.movieinfo.features.common.viewmodel.ThemeViewModel

open class BaseDialogFragment : DialogFragment() {
    protected val themeViewModel: ThemeViewModel by activityViewModels()
}