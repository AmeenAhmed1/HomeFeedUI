package com.ameen.qurbatask.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ameen.qurbatask.R

@Composable
fun AppBarIcon(iconResource: Int, showIndicator: Boolean, indicatorPosition: Alignment? = null) {
    Box(modifier = Modifier.padding(8.dp)) {
        Image(painter = painterResource(id = iconResource), contentDescription = " ")

        if (showIndicator) Image(
            painter = painterResource(id = R.drawable.ic_notifiaction_indicator),
            contentDescription = " ",
            modifier = Modifier.align(indicatorPosition!!)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun AppBarIconPreview() {
    AppBarIcon(R.drawable.ic_notification, true, Alignment.BottomEnd)
}


@Preview(showBackground = true)
@Composable
private fun AppBarIconPreviewIndicatorTop() {
    AppBarIcon(R.drawable.ic_notification, true, Alignment.TopStart)
}

@Preview(showBackground = true)
@Composable
private fun AppBarIconPreviewNoIndicator() {
    AppBarIcon(R.drawable.ic_notification, false, Alignment.BottomEnd)
}