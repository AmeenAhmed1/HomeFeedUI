package com.ameen.qurbatask.ui.component

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.ameen.qurbatask.R
import com.ameen.qurbatask.util.TextType

private val TitleTextTheme = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = 20.sp,
    fontFamily = FontFamily(Font(R.font.montserrat_bold))
)

private val NormalTextTheme = TextStyle(
    fontWeight = FontWeight.W600,
    fontSize = 15.sp,
    fontFamily = FontFamily(Font(R.font.montserrat_light))
)

private val LightTextTheme = TextStyle(
    fontWeight = FontWeight.Light,
    color = Color.Gray,
    fontSize = 15.sp,
    fontFamily = FontFamily(Font(R.font.montserrat_light))
)

@Composable
fun TextToView(textToShow: String, textType: TextType?) {
    when (textType) {
        TextType.TEXT_TITLE -> Text(
            text = textToShow,
            style = TitleTextTheme,
        )
        TextType.TEXT_PUBLISHED_DATE -> Text(
            text = textToShow,
            style = LightTextTheme,
        )
        TextType.TEXT_NORMAL -> Text(
            text = textToShow,
            style = NormalTextTheme,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TextToViewPreview() {
    TextToView(textToShow = "Text", textType = TextType.TEXT_TITLE)
}