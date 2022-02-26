package com.ameen.qurbatask.ui.view

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ameen.qurbatask.R
import com.ameen.qurbatask.ui.component.RoundedImage
import com.ameen.qurbatask.ui.component.TextToView
import com.ameen.qurbatask.util.TextType

@Composable
fun ContentType(titleText: String, typeText: String) {
    Column(
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp, top = 16.dp)
            .fillMaxWidth()
    ) {
        Row {
            RoundedImage(
                imageSource = R.drawable.ic_restourant_tag,
                modifier = Modifier
                    .padding(end = 8.dp)
                    .width(40.dp)
                    .height(40.dp)
            )

            Column(
                modifier = Modifier.wrapContentHeight(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                TextToView(textToShow = titleText, textType = TextType.TEXT_TITLE)
                TextToView(textToShow = typeText, textType = TextType.TEXT_NORMAL)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ContentTypePreview() {
    ContentType("TitleText", "TypeText")
}