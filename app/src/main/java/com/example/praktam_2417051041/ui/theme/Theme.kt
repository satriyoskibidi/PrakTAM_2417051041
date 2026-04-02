package com.example.praktam_2417051041.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val AppColorScheme = lightColorScheme(
    primary = RedPrimary,
    secondary = BlackSecondary,
    background = GrayBackground,
    surface = WhiteSurface,
    onPrimary = OnPrimaryText,
    onSurface = OnSurfaceText
)

@Composable
fun RemotiviTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = AppColorScheme,
        typography = AppTypography,
        content = content
    )
}