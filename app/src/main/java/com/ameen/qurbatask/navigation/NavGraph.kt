package com.ameen.qurbatask.navigation

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ameen.qurbatask.ui.screen.MainScreen
import com.ameen.qurbatask.ui.screen.SplashScreen
import com.ameen.qurbatask.ui.view.TopAppBar
import com.ameen.qurbatask.viewmodel.PostsViewModel

@Composable
fun SetupNavGraph(navController: NavHostController, viewModel: PostsViewModel) {

    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {

        composable(route = Screen.Splash.route) { SplashScreen(navController) }

        composable(route = Screen.Main.route) {
            Scaffold(topBar = { TopAppBar() }) {
                MainScreen(viewModel = viewModel)
            }
        }
    }
}