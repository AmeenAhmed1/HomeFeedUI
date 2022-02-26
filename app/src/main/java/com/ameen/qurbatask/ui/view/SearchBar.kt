package com.ameen.qurbatask.ui.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ameen.qurbatask.R
import com.ameen.qurbatask.ui.component.RoundedImage

@Composable
fun SearchBar() {

    var textSearchInput by remember { mutableStateOf("") }

    Row(verticalAlignment = Alignment.CenterVertically) {

        RoundedImage(
            imageSource = R.drawable.image_user,
            modifier = Modifier
                .padding(16.dp)
                .width(50.dp)
                .height(50.dp)
        )

        Card(
            modifier = Modifier
                .padding(end = 16.dp)
                .fillMaxWidth()
                .height(50.dp),
            elevation = 4.dp,
            shape = RoundedCornerShape(50.dp)
        ) {
            TextField(
                modifier = Modifier
                    .fillMaxSize(),
                value = textSearchInput,
                onValueChange = { inputText ->
                    textSearchInput = inputText
                },
                singleLine = true,
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color.Black,
                    disabledTextColor = Color.Transparent,
                    backgroundColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                ),
                placeholder = {
                    Text(
                        modifier = Modifier.fillMaxSize(),
                        text = "Share your food experiences",
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.montserrat_light)),
                        color = Color.Gray
                    )
                },
                textStyle = TextStyle(fontSize = 15.sp),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                ),
            )
        }
    }

}

@Preview(showBackground = false)
@Composable
private fun SearchBarPreview() {
    SearchBar()
}