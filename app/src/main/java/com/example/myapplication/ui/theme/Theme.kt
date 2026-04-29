package com.example.myapplication.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(

    primary = BluePrimaryDark,
    secondary = BlueSecondaryDark,
    tertiary = BlueTertiaryDark,

    background = DarkBackground,
    surface = DarkSurface,
    surfaceVariant = DarkSurfaceVariant,

    onBackground = DarkText,
    onSurface = DarkText,
    onSurfaceVariant = DarkText
)

private val LightColorScheme = lightColorScheme(

    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40,

    background = LightBackground,
    surface = LightSurface,
    surfaceVariant = LightSurfaceVariant,

    onBackground = LightText,
    onSurface = LightText,
    onSurfaceVariant = LightText
)

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {

    val colorScheme =
        if (darkTheme)
            DarkColorScheme
        else
            LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}