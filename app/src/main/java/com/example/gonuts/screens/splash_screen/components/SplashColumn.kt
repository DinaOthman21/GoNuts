package com.example.gonuts.screens.splash_screen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gonuts.ui.theme.Inter

@Composable
fun SplashColumn(){
    Column(
        Modifier.
        fillMaxSize()
            .padding(
                start = 40.dp,
                end = 40.dp,
                bottom = 46.dp
            )
    ) {
        Text(
            text = "Gonuts with Donuts",
            fontSize = 54.sp,
            color = Color(0xFFFF7074),
            fontFamily = Inter,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.width(193.dp),
            lineHeight = 54.sp
        )
        Spacer(Modifier.height(19.dp))
        Text(
            text = "Gonuts with Donuts is a Sri Lanka dedicated food outlets for specialize manufacturing of Donuts in Colombo, Sri Lanka.",
            fontSize = 18.sp,
            color = Color(0xFFFF9494),
            fontFamily = Inter,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.fillMaxWidth(),
        )
        Spacer(Modifier.height(60.dp))
        SplashButton()
    }
}


@Composable
@Preview(showBackground = true)
fun  SplashColumnPreview(){
    SplashColumn()
}