package com.ameen.qurbatask.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ameen.qurbatask.data.PostModel
import com.ameen.qurbatask.ui.theme.QurbaTaskTheme
import com.ameen.qurbatask.ui.view.PostContent
import com.ameen.qurbatask.ui.view.SearchBar

@Composable
fun MainScreen(postToDisplay: List<PostModel>) {
    // A surface container using the 'background' color from the theme
    QurbaTaskTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {

            Column {

                SearchBar()

                LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {

                    itemsIndexed(postToDisplay) { index, item ->
                        Divider(
                            color = Color.LightGray,
                            thickness = 5.dp
                        )

                        PostContent(post = item)

//                        if (index < postToDisplay.lastIndex) Divider(
//                            color = Color.LightGray,
//                            thickness = 5.dp
//                        )
                    }
                }
            }
        }
    }
}