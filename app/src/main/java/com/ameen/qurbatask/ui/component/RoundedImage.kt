package com.ameen.qurbatask.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ameen.qurbatask.R

@Composable
fun RoundedImage(imageSource: Int, modifier: Modifier) {
    Card(
        modifier = modifier,
        shape = CircleShape,
    ) {
        Image(
            painter = painterResource(imageSource),
            contentDescription = "ContentDescription",
            contentScale = ContentScale.Crop,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RoundedImagePreview() {
    RoundedImage(
        R.drawable.image, modifier = Modifier
            .padding(end = 8.dp)
            .size(30.dp)
    )
}