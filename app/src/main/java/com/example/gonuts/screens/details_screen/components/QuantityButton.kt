package com.example.gonuts.screens.details_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import com.example.gonuts.ui.theme.Inter


@Composable
fun BoxQuantity(
    modifier: Modifier = Modifier,
    color: Color,
    text: String,
    fontSize: TextUnit,
    textColor: Color
) {
    Box(
        modifier = modifier
            .size(45.dp)
            .clip(RoundedCornerShape(15.dp))
            .background(color)
        ) {
        Text(
            text = text,
            fontSize = fontSize,
            color = textColor,
            fontFamily = Inter,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.align(Alignment.Center),
            letterSpacing = 0.sp,
        )
    }
}

@Composable
@Preview(showBackground = true)
fun BoxQuantityPreview(){
    BoxQuantity(
        text = "+",
        fontSize = 32.sp,
        color = Color.Black,
        textColor = Color.White
    )
}