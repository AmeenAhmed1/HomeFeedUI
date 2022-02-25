package com.ameen.qurbatask.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ameen.qurbatask.R
import com.ameen.qurbatask.data.ItemModel
import com.ameen.qurbatask.data.ItemType
import com.ameen.qurbatask.ui.component.ButtonTextWithIcon
import com.ameen.qurbatask.ui.component.RoundedImage
import com.ameen.qurbatask.ui.component.TextToView
import com.ameen.qurbatask.util.TextType
import com.ameen.qurbatask.util.Utils

@Composable
fun ItemMain(item: ItemModel) {

    Column(Modifier.background(Color.White)) {

        // Title with image Section.
        Row(
            Modifier
                .fillMaxWidth()
                .padding(
                    start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp
                ),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Box {
                Row {
                    RoundedImage(
                        imageSource = R.drawable.image_content,
                        modifier = Modifier
                            .padding(end = 8.dp)
                            .size(60.dp)
                    )

                    Column {
                        item.itemTitle?.let { TextToView(textToShow = it, TextType.TEXT_TITLE) }
                        TextToView(
                            textToShow = "${item.itemPublishedDay.toString()} days ago",
                            TextType.TEXT_PUBLISHED_DATE
                        )
                    }

                    RoundedImage(
                        imageSource = R.drawable.ic_restourant,
                        modifier = Modifier
                            .padding(4.dp)
                            .size(20.dp)
                    )
                }
            }

            Image(
                alignment = Alignment.BottomCenter,
                painter = painterResource(id = R.drawable.ic_more),
                contentDescription = " "
            )


        }

        // Place Description
        Box(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 8.dp)) {
            TextToView(
                textToShow = stringResource(id = R.string.description),
                TextType.TEXT_NORMAL
            )
        }

        // Image Section
        Image(
            painter = painterResource(id = R.drawable.image),
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop,
            contentDescription = " "
        )

        if (item.itemType != ItemType.USER) item.itemTitle?.let {
            ContentType(
                it,
                typeText = Utils.getType(item.itemType!!)
            )
        }

        Divider(
            modifier = Modifier.padding(8.dp),
            color = Color.Black,
            thickness = 0.5.dp
        )

        //Button Interaction Section
        Row(
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            ButtonTextWithIcon(text = "32K", iconResource = R.drawable.ic_like)
            ButtonTextWithIcon(text = "597", iconResource = R.drawable.ic_comment)
            ButtonTextWithIcon(text = "12.3K", iconResource = R.drawable.ic_share)
        }

        Divider(modifier = Modifier.padding(8.dp), color = Color.Black, thickness = 0.5.dp)
    }

}

@Preview(showBackground = true)
@Composable
fun ContentPreview() {
    val item = ItemModel(
        itemTitle = "Chicken Chester",
        itemPublishedDay = 2,
        itemType = ItemType.CAFE_AND_RESTAURANT
    )

    ItemMain(item = item)
}