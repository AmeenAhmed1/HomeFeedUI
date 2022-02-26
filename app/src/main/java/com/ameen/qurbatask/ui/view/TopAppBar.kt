package com.ameen.qurbatask.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ameen.qurbatask.R
import com.ameen.qurbatask.ui.component.AppBarIcon

@Composable
fun TopAppBar() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        shape = RoundedCornerShape(bottomEnd = 8.dp, bottomStart = 8.dp),
        elevation = 4.dp
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {

            Image(
                modifier = Modifier.padding(start = 16.dp),
                painter = painterResource(id = R.drawable.ic_logo), contentDescription = ""
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            ) {

                AppBarIcon(
                    iconResource = R.drawable.ic_search,
                    showIndicator = false
                )

                AppBarIcon(
                    iconResource = R.drawable.ic_notification,
                    showIndicator = true,
                    indicatorPosition = Alignment.BottomEnd
                )

                AppBarIcon(
                    iconResource = R.drawable.ic_cart,
                    showIndicator = true,
                    indicatorPosition = Alignment.TopEnd
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun TopAppBarPreview() {
    TopAppBar()
}