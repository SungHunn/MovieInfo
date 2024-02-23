package com.example.movieinfo

import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.movieinfo.features.common.viewmodel.ThemeViewModel

open class BaseFragment : Fragment() {
    protected val themeViewModel: ThemeViewModel by activityViewModels()
}