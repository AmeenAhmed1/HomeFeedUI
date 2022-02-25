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
import com.ameen.qurbatask.data.DummyData
import com.ameen.qurbatask.data.PostModel
import com.ameen.qurbatask.ui.component.ButtonTextWithIcon
import com.ameen.qurbatask.ui.component.RoundedImage
import com.ameen.qurbatask.ui.component.TextToView
import com.ameen.qurbatask.util.TextType
import com.ameen.qurbatask.util.Utils

@Composable
fun ItemMain(post: PostModel) {

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
                        post.itemTitle?.let { TextToView(textToShow = it, TextType.TEXT_TITLE) }
                        TextToView(
                            textToShow = "${post.itemPublishedDay.toString()} days ago",
                            TextType.TEXT_PUBLISHED_DATE
                        )
                    }

                    RoundedImage(
                        imageSource = if (post.itemType!! < 3)
                            R.drawable.ic_restourant
                        else R.drawable.ic_verified_user,
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
        val image = if (post.itemType == 2)
            R.drawable.image
        else R.drawable.burger

        Image(
            painter = painterResource(id = image),
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop,
            contentDescription = " "
        )

        if (post.itemType!! < 3) post.itemTitle?.let {
            ContentType(
                it,
                typeText = Utils.getPlaceType(post.itemType)!!
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

            ButtonTextWithIcon(
                text = post.itemLikeCount?.toString()!!,
                iconResource = R.drawable.ic_like
            )
            ButtonTextWithIcon(
                text = post.itemCommentCount?.toString()!!,
                iconResource = R.drawable.ic_comment
            )
            ButtonTextWithIcon(
                text = post.itemShareCount?.toString()!!,
                iconResource = R.drawable.ic_share
            )
        }

        Divider(modifier = Modifier.padding(8.dp), thickness = 0.dp)
    }

}

@Preview(showBackground = true)
@Composable
fun ContentPreview() {
    val item = DummyData().getDummyData()[0]

    ItemMain(post = item)
}