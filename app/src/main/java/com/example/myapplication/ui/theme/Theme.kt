package com.example.myapplication.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class ExtendedColors(
    val success: Color,
    val onSuccess: Color = Color.White,
    val successContainer: Color,
    val error: Color,
    val errorContainer: Color,
    val warning: Color,
    val easy: Color,
    val medium: Color,
    val hard: Color,
    val mixed: Color
)

private val LightExtendedColors = ExtendedColors(
    success = SuccessGreenLight,
    successContainer = SuccessContainerLight,
    error = ErrorRedLight,
    errorContainer = ErrorContainerLight,
    warning = WarningAmberLight,
    easy = EasyColorLight,
    medium = MediumColorLight,
    hard = HardColorLight,
    mixed = MixedColorLight
)

private val DarkExtendedColors = ExtendedColors(
    success = SuccessGreenDark,
    onSuccess = Color(0xFF06280F),
    successContainer = SuccessContainerDark,
    error = ErrorRedDark,
    errorContainer = ErrorContainerDark,
    warning = WarningAmberDark,
    easy = EasyColorDark,
    medium = MediumColorDark,
    hard = HardColorDark,
    mixed = MixedColorDark
)

private val LocalExtendedColors = staticCompositionLocalOf { LightExtendedColors }

private val DarkColorScheme = darkColorScheme(
    primary = BluePrimaryDark,
    onPrimary = Color(0xFF0B1020),
    primaryContainer = Color(0xFF233047),
    onPrimaryContainer = BluePrimaryDark,
    secondary = BlueSecondaryDark,
    tertiary = BlueTertiaryDark,

    background = DarkBackground,
    surface = DarkSurface,
    surfaceVariant = DarkSurfaceVariant,
    outline = DarkOutline,
    outlineVariant = DarkOutline,

    error = ErrorRedDark,
    onError = Color(0xFF2C0A0E),
    errorContainer = ErrorContainerDark,
    onErrorContainer = ErrorRedDark,

    onBackground = DarkText,
    onSurface = DarkText,
    onSurfaceVariant = DarkTextMuted
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    onPrimary = Color.White,
    primaryContainer = Color(0xFFE4E0FB),
    onPrimaryContainer = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40,

    background = LightBackground,
    surface = LightSurface,
    surfaceVariant = LightSurfaceVariant,
    outline = LightOutline,
    outlineVariant = LightOutline,

    error = ErrorRedLight,
    onError = Color.White,
    errorContainer = ErrorContainerLight,
    onErrorContainer = ErrorRedLight,

    onBackground = LightText,
    onSurface = LightText,
    onSurfaceVariant = LightTextMuted
)

val MaterialTheme.extendedColors: ExtendedColors
    @Composable
    get() = LocalExtendedColors.current

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

    val extendedColors = if (darkTheme) DarkExtendedColors else LightExtendedColors

    CompositionLocalProvider(LocalExtendedColors provides extendedColors) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}
