package com.ameen.qurbatask.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ameen.qurbatask.data.ItemModel
import com.ameen.qurbatask.ui.theme.QurbaTaskTheme
import com.ameen.qurbatask.ui.view.ItemMain

@Composable
fun MainScreen(itemToDisplay: List<ItemModel>) {
    // A surface container using the 'background' color from the theme
    QurbaTaskTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                itemsIndexed(itemToDisplay) { index, item ->
                    ItemMain(item = item)
                    if (index < itemToDisplay.lastIndex) Divider(
                        color = Color.LightGray,
                        thickness = 5.dp
                    )
                }
            }
        }
    }
}