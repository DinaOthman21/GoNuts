package com.example.gonuts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.gonuts.screens.home_screen.HomeScreen
import com.example.gonuts.screens.splash_screen.SplashScreen
import com.example.gonuts.ui.theme.GoNutsTheme
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GoNutsTheme {
                val systemUiController: SystemUiController = rememberSystemUiController()
                systemUiController.isSystemBarsVisible = false
                SplashScreen()
                //HomeScreen()
            }
        }
    }
}

