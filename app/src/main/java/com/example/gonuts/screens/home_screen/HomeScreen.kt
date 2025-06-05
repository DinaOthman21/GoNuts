package com.example.gonuts.screens.home_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gonuts.screens.home_screen.components.BottomBar
import com.example.gonuts.screens.home_screen.components.DountCards
import com.example.gonuts.screens.home_screen.components.DountsItems
import com.example.gonuts.screens.home_screen.components.HomeHeader
import com.example.gonuts.ui.theme.Inter

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .safeDrawingPadding()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color.White, Color(0xFFF0F0F0))
                    )
                )
                .padding(bottom = 80.dp)
                .verticalScroll(rememberScrollState())
        ) {
            HomeHeader()
            Spacer(Modifier.height(54.dp))
            Text(
                text = "Today Offers",
                fontSize = 20.sp,
                color = Color.Black,
                fontFamily = Inter,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(start = 38.dp)
            )
            Spacer(Modifier.height(25.dp))
            DountsItems()
            Spacer(Modifier.height(46.dp))
            Text(
                text = "Donuts",
                fontSize = 20.sp,
                color = Color.Black,
                fontFamily = Inter,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(start = 38.dp)
            )
            Spacer(Modifier.height(17.dp))
            DountCards()
        }
        BottomBar(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(start = 15.dp, bottom = 38.dp)
        )
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun HomeScreenPreview(){
    HomeScreen()
}