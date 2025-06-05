package com.example.gonuts.screens.details_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gonuts.screens.home_screen.components.dounts
import com.example.gonuts.ui.theme.Inter

@Composable
fun ButtonRow(){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 40.dp,
                end = 40.dp
            )
    ) {
        Text(
            text = "$${dounts[0].newPrice}",
            fontSize = 30.sp,
            color = Color.Black,
            fontFamily = Inter,
            fontWeight = FontWeight.SemiBold,
        )
        Spacer(Modifier.width(26.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(50.dp))
                .background(Color(0xFFFF7074)),
        ) {
            Text(
                text = "Add to Cart",
                fontSize = 20.sp,
                color = Color.White,
                fontWeight = FontWeight.SemiBold,
                fontFamily = Inter,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(vertical = 22.dp).fillMaxWidth(),
            )
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ButtonRowPreview(){
    ButtonRow()
}