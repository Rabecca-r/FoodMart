package com.example.foodmart.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Light palette tuned around a white / light grey background
private val LightColors = lightColorScheme(
    primary = FoodBlue,
    onPrimary = Color.White,
    primaryContainer = FoodBlueLight,
    onPrimaryContainer = Color.White,
    secondary = FoodBlueDark,
    onSecondary = Color.White,
    background = FoodBackground,
    onBackground = Color(0xFF020617),
    surface = FoodCard,
    onSurface = Color(0xFF020617),
)

// Simple dark scheme so the app still looks decent in dark mode
private val DarkColors = darkColorScheme(
    primary = FoodBlueLight,
    onPrimary = Color.White,
    background = Color(0xFF020617),
    surface = Color(0xFF020617),
    onSurface = Color(0xFFF9FAFB)
)

// Top-level theme wrapper
@Composable
fun FoodMartTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        typography = Typography,
        content = content
    )
}
