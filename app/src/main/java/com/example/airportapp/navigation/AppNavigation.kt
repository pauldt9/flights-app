package com.example.airportapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.airportapp.screens.LoginScreen
import com.example.airportapp.screens.SignUpScreen
import com.example.airportapp.screens.SplashScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(navController, startDestination = "login"){
        composable("login"){
            LoginScreen(navController)
        }
        composable("sign up"){
            SignUpScreen(navController)
        }
        composable ("splash screen"){
            SplashScreen(navController)
        }
    }
}