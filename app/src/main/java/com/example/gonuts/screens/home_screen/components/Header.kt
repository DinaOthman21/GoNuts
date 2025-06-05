package com.example.gonuts.screens.home_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gonuts.ui.theme.Inter
import com.example.gonuts.R

@Composable
fun HomeHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 38.dp,end = 30.dp,top = 61.dp)
    ) {
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = "Let’s Gonuts!",
                fontSize = 30.sp,
                color = Color(0xFFFF7074),
                fontFamily = Inter,
                fontWeight = FontWeight.SemiBold,
            )
            Spacer(Modifier.height(3.dp))
            Text(
                text = "Order your favourite donuts from here",
                fontSize = 14.sp,
                color = Color(0xFF000000).copy(alpha = .6f),
                fontFamily = Inter,
                fontWeight = FontWeight.Medium,
            )
        }

        Box(
            modifier = Modifier
                .padding(top = 3.dp)
                .size(45.dp)
                .clip(RoundedCornerShape(15.dp))
                .background(Color(0xFFFED8DF))
        ) {
            Icon(
                modifier = Modifier
                    .size(24.dp)
                    .align(Alignment.Center),
                painter = painterResource(R.drawable.ic_round_search),
                contentDescription = "search icon",
                tint = Color(0xFFFF7074)
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun HomeHeaderPreview(){
    HomeHeader()
}