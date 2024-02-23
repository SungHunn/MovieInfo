package com.example.movieinfo.features.common.viewmodel

import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import com.example.movieinfo.ui.config.ComponentConfig
import com.example.movieinfo.ui.config.DefaultComponentConfig
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class ThemeViewModel @Inject constructor() : ViewModel() {
    private val _themeState: MutableStateFlow<ComponentConfig> =
        MutableStateFlow(DefaultComponentConfig.RED_THEME)
    val themeState: StateFlow<ComponentConfig>
        get() = _themeState

    private val _nextColorState: MutableStateFlow<Color> =
        MutableStateFlow(DefaultComponentConfig.BLUE_THEME.colors)
    val nextColorState: StateFlow<Color>
        get() = _nextColorState

    fun toggleColorSet() {
        if (themeState.value.colors is Color) {
            _themeState.value = DefaultComponentConfig.BLUE_THEME
            _nextColorState.value = Color.Red
        } else {
            _themeState.value = DefaultComponentConfig.RED_THEME
            _nextColorState.value = Color.Blue
        }
    }

}