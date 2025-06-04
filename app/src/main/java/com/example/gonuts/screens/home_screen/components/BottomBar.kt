package com.example.gonuts.screens.home_screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.gonuts.R


@Composable
fun BottomBar(){
    Row(
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Image(
            painter = painterResource(R.drawable.home),
            contentDescription = "home icon",
            modifier = Modifier.weight(1f)
        )
        Image(
            painter = painterResource(R.drawable.heart),
            contentDescription = "home icon",
            modifier = Modifier.weight(1f)
        )
        Image(
            painter = painterResource(R.drawable.notification),
            contentDescription = "home icon",
            modifier = Modifier.weight(1f)
        )
        Image(
            painter = painterResource(R.drawable.buy),
            contentDescription = "home icon",
            modifier = Modifier.weight(1f)
        )
        Image(
            painter = painterResource(R.drawable.mingcute_user_2_line),
            contentDescription = "home icon",
            modifier = Modifier.weight(1f)
        )
    }
}

@Composable
@Preview(showBackground = true)
fun BottomBarPreview(){
    BottomBar()
}