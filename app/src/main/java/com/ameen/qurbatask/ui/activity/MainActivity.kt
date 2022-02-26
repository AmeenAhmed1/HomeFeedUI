package com.ameen.qurbatask.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.rememberNavController
import com.ameen.qurbatask.navigation.SetupNavGraph
import com.ameen.qurbatask.repository.PostsRepository
import com.ameen.qurbatask.viewmodel.PostsViewModel
import com.ameen.qurbatask.viewmodel.PostsViewModelFactory

private const val TAG = "MainActivity"

class MainActivity : ComponentActivity() {

    private lateinit var viewModel: PostsViewModel
    private lateinit var repository: PostsRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            initViewModel()

            val navController = rememberNavController()
            SetupNavGraph(navController = navController, viewModel)
            //MainActivityScreen(applicationContext)
        }
    }

    private fun initViewModel() {
        repository = PostsRepository(this)
        viewModel = ViewModelProvider(
            this,
            PostsViewModelFactory(repository)
        ).get(PostsViewModel::class.java)
    }
}