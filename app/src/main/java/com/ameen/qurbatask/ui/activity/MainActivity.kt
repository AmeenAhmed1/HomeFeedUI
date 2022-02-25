package com.ameen.qurbatask.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ameen.qurbatask.data.DummyData
import com.ameen.qurbatask.ui.screen.MainScreen

private const val TAG = "MainActivity"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen(postToDisplay = DummyData().loadDataFromJson(applicationContext))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    //MainScreen(postToDisplay = DummyData().getDummyData())
}