package com.ameen.qurbatask.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ameen.qurbatask.data.DummyData
import com.ameen.qurbatask.data.PostModel
import com.ameen.qurbatask.ui.theme.QurbaTaskTheme
import com.ameen.qurbatask.ui.view.PostContent
import com.ameen.qurbatask.ui.view.SearchBar
import com.ameen.qurbatask.viewmodel.PostsViewModel
import kotlinx.coroutines.delay

@Composable
fun MainScreen(viewModel: PostsViewModel) {
    // A surface container using the 'background' color from the theme

    var isLoading by remember { mutableStateOf(true) }

    QurbaTaskTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {

            Column {

                SearchBar()

                LaunchedEffect(key1 = true) {
                    delay(1000)
                    isLoading = false
                }

                if (isLoading) SkeletonLoadingScreen()
                else viewModel.postFromJsonFile.value?.let {
                    ShowPostContent(postToDisplay = it)
                }
            }
        }
    }
}

@Composable
private fun ShowPostContent(postToDisplay: List<PostModel>) {
    LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {

        itemsIndexed(postToDisplay) { index, item ->
            Divider(
                color = Color.LightGray,
                thickness = 5.dp
            )

            PostContent(post = item)
        }
    }
}

@Preview
@Composable
fun MainScreenPreview() {
    ShowPostContent(postToDisplay = DummyData().getDummyData())
}