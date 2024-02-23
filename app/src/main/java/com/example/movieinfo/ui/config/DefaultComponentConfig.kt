package com.example.movieinfo.ui.config

import androidx.compose.ui.graphics.Color
import com.example.movieinfo.ui.theme.Shapes

object DefaultComponentConfig {
    val RED_THEME = ComponentConfig(
        colors = Color.Red,
        shapes = Shapes,
        typography = Typography,
        isDarkTheme = false
    )

    val BLUE_THEME = ComponentConfig(
        colors = Color.Blue,
        shapes = Shapes,
        typography = Typography,
        isDarkTheme = false
    )

    private var currentConfig = RED_THEME
    private var themeColorSet: Color = Color.Red
}