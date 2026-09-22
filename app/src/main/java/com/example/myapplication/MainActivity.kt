package com.example.myapplication

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.example.myapplication.ui.navigation.AppNavigation
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {

    private var isDarkMode by mutableStateOf(false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val sharedPreferences = getSharedPreferences("app_settings", Context.MODE_PRIVATE)
        isDarkMode = sharedPreferences.getBoolean("dark_mode", false)

        // Match the native window background to the saved theme before Compose
        // inflates, so cold start doesn't flash the wrong background color.
        window.setBackgroundDrawable(
            ColorDrawable(if (isDarkMode) Color.parseColor("#0E1016") else Color.parseColor("#F6F5FB"))
        )

        setContent {
            val view = LocalView.current
            DisposableEffect(isDarkMode) {
                val insetsController = WindowCompat.getInsetsController(window, view)
                insetsController.isAppearanceLightStatusBars = !isDarkMode
                insetsController.isAppearanceLightNavigationBars = !isDarkMode
                onDispose {}
            }

            MyApplicationTheme(darkTheme = isDarkMode) {
                AppNavigation(
                    isDarkMode = isDarkMode,
                    onThemeToggle = {
                        isDarkMode = !isDarkMode
                        sharedPreferences.edit()
                            .putBoolean("dark_mode", isDarkMode)
                            .apply()
                    }
                )
            }
        }
    }
}