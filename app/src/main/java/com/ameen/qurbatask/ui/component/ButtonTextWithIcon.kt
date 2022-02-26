package com.ameen.qurbatask.ui.component

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ameen.qurbatask.R
import com.ameen.qurbatask.util.TextType

private const val TAG = "ButtonTextWithIcon"

@Composable
fun ButtonTextWithIcon(text: String, iconResource: Int, onClickAction: () -> Unit) {
    TextButton(
        onClick = onClickAction,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent,
            contentColor = Color.Black
        )
    ) {
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
fun ButtonTextWithIconPreview() =
    ButtonTextWithIcon(text = "43K", iconResource = R.drawable.ic_share) {
        Log.i(
            TAG,
            "ButtonTextWithIconPreview: Clicked"
        )
    }