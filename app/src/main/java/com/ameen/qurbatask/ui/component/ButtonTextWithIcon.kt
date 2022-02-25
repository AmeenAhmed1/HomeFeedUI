package com.ameen.qurbatask.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ameen.qurbatask.R
import com.ameen.qurbatask.util.TextType

@Composable
fun ButtonTextWithIcon(text: String, iconResource: Int) {
    Box {
        Row {
            TextToView(textToShow = text, textType = TextType.TEXT_TITLE)
            Image(
                painter = painterResource(id = iconResource),
                contentDescription = " ",
                Modifier.padding(start = 8.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonTextWithIconPreview() {
    ButtonTextWithIcon(text = "43K", iconResource = R.drawable.ic_share)
}