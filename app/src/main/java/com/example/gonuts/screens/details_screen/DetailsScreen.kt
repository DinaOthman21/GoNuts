package com.example.gonuts.screens.details_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import com.example.gonuts.R
import com.example.gonuts.screens.details_screen.components.DetailsSection

@Composable
fun DetailsScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFED8DF))
    ){
       Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 436.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 40.dp,
                        topEnd = 40.dp
                    )
                )
        ){
            DetailsSection()
        }

        Image(
            painter = painterResource(R.drawable.big_donut),
            contentDescription = "donut image",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(
                    top = 45.dp
                )
        )

        Icon(
            painter = painterResource(R.drawable.ic_round_arrow_back),
            contentDescription = "back icon",
            tint = Color(0xFFFF7074),
            modifier = Modifier
                .padding(
                    top = 45.dp,
                    start = 32.dp
                )
        )

        Box(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(
                    end = 33.dp,
                    top = 410.dp
                )
                .shadow(
                    elevation = 1.dp,
                    shape = RoundedCornerShape(15.dp)
                )
                .clip(RoundedCornerShape(15.dp))
                .size(45.dp)
                .background(Color.White)
        ) {
            Icon(
                modifier = Modifier.align(Alignment.Center),
                painter = painterResource(R.drawable.vector),
                contentDescription = "favourite icon",
                tint = Color(0xFFFF7074)
            )
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun DetailsScreenPreview(){
    DetailsScreen()
}