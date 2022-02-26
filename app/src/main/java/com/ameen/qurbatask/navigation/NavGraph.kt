package com.ameen.qurbatask.navigation

import android.content.Context
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ameen.qurbatask.data.DummyData
import com.ameen.qurbatask.ui.screen.MainScreen
import com.ameen.qurbatask.ui.screen.SplashScreen
import com.ameen.qurbatask.ui.view.TopAppBar

@Composable
fun SetupNavGraph(navController: NavHostController, context: Context) {

    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {

        composable(route = Screen.Splash.route) { SplashScreen(navController) }

        composable(route = Screen.Main.route) {
            Scaffold(topBar = { TopAppBar() }) {
                MainScreen(postToDisplay = DummyData().loadDataFromJson(context))
            }
        }
    }
}