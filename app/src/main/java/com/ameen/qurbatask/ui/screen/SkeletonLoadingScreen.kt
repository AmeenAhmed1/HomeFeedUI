package com.ameen.qurbatask.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ameen.qurbatask.ui.view.ItemContentSkeleton

@Composable
fun SkeletonLoadingScreen() {
    Surface {
        LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            items(2) {
                ItemContentSkeleton()
                Divider(
                    color = Color.LightGray,
                    thickness = 5.dp
                )
            }
        }
    }
}

@Preview
@Composable
private fun SkeletonLoadingScreenPreview() {
    SkeletonLoadingScreen()
}