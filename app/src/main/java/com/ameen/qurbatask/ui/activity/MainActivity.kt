package com.ameen.qurbatask.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.ameen.qurbatask.data.DummyData
import com.ameen.qurbatask.navigation.SetupNavGraph
import com.ameen.qurbatask.ui.screen.MainScreen
import com.ameen.qurbatask.ui.view.TopAppBar

private const val TAG = "MainActivity"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            SetupNavGraph(navController = navController, applicationContext)
            //MainActivityScreen(applicationContext)
        }
    }
}

//@Composable
//private fun MainActivityScreen(context: Context) {
//    Scaffold(topBar = { TopAppBar() }) {
//        MainScreen(postToDisplay = DummyData().loadDataFromJson(context))
//    }
//}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Scaffold(topBar = { TopAppBar() }) {
        MainScreen(postToDisplay = DummyData().getDummyData())
    }
}