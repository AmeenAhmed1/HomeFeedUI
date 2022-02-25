package com.ameen.qurbatask.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Colors
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ameen.qurbatask.data.DummyData
import com.ameen.qurbatask.data.ItemModel
import com.ameen.qurbatask.data.ItemType
import com.ameen.qurbatask.ui.screen.MainScreen
import com.ameen.qurbatask.ui.theme.QurbaTaskTheme
import com.ameen.qurbatask.ui.view.ItemMain

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen(itemToDisplay = DummyData().getDummyData())
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen(itemToDisplay = DummyData().getDummyData())
}