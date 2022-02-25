package com.ameen.qurbatask.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ameen.qurbatask.ui.theme.graySkeletonBackground

@Composable
fun ItemContentSkeleton() {

    Column(Modifier.background(Color.White)) {

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

                    Box(
                        modifier = Modifier
                            .padding(end = 16.dp)
                            .size(80.dp)
                            .clip(CircleShape)
                            .background(graySkeletonBackground)
                    )

                    Column(
                        modifier = Modifier.align(Alignment.CenterVertically),
                        verticalArrangement = Arrangement.spacedBy(20.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .width(200.dp)
                                .height(20.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(graySkeletonBackground)
                        )
                        Box(
                            modifier = Modifier
                                .width(100.dp)
                                .height(10.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(graySkeletonBackground)
                        )
                    }
                }
            }
        }

        Box(
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth()
                .height(200.dp)
                .background(graySkeletonBackground)
        )

        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Box(
                modifier = Modifier
                    .width(50.dp)
                    .height(10.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(graySkeletonBackground)
            )

            Box(
                modifier = Modifier
                    .width(50.dp)
                    .height(10.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(graySkeletonBackground)
            )

            Box(
                modifier = Modifier
                    .width(50.dp)
                    .height(10.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(graySkeletonBackground)
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun ItemContentSkeletonPreview() {
    ItemContentSkeleton()
}
