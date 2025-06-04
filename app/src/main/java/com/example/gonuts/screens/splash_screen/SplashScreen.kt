package com.example.gonuts.screens.splash_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.gonuts.R
import androidx.compose.ui.tooling.preview.Preview
import com.example.gonuts.screens.splash_screen.components.SplashColumn

@Composable
fun SplashScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFED8DF))
    ){
        Image(
            painter = painterResource(R.drawable.dounts),
            contentDescription = "Dounts",
        )
        Image(
            painter = painterResource(R.drawable.purple_dount),
            contentDescription = "Dounts",
        )
        Image(
            painter = painterResource(R.drawable.pink_dount),
            contentDescription = "Dounts",
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(end = 33.dp, top = 40.dp)
        )
        Image(
            painter = painterResource(R.drawable.small_pink_dount),
            contentDescription = "Dounts",
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 30.dp, top = 275.dp)
        )
        Image(
            painter = painterResource(R.drawable.half_dount),
            contentDescription = "half dount",
            modifier = Modifier
                .align(Alignment.CenterEnd)
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 420.dp)
        ){
            SplashColumn()
        }
    }
}

@Composable
@Preview(showBackground = true)
fun SplashScreenPreview(){
    SplashScreen()
}