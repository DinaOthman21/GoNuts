package com.example.gonuts.screens.details_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import com.example.gonuts.screens.home_screen.components.dounts
import com.example.gonuts.ui.theme.Inter

@Composable
fun DetailsSection(){
    Card(
        colors = CardColors(
            containerColor = Color.Transparent,
            contentColor = Color.Transparent,
            disabledContainerColor = Color.Transparent,
            disabledContentColor = Color.Transparent
        ),
        shape = RoundedCornerShape(topEnd = 40.dp, topStart = 40.dp),
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color.White, Color(0xFFF0F0F0))
                )
            )
    ) {
        Column(
            modifier = Modifier.padding(start = 40.dp,top = 35.dp)
        ) {
            Text(
                text = dounts[0].name,
                fontSize = 30.sp,
                color = Color(0xFFFF7074),
                fontWeight = FontWeight.SemiBold,
                fontFamily = Inter,
                letterSpacing = 0.sp
            )
            Spacer(Modifier.height(33.dp))
            Text(
                text = "About Gonut",
                fontSize = 18.sp,
                color = Color.Black.copy(alpha = .8f),
                fontWeight = FontWeight.Medium,
                fontFamily = Inter,
                letterSpacing = 0.sp
            )
            Spacer(Modifier.height(16.dp))
            Text(
                text = "These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
                fontSize = 14.sp,
                color = Color.Black.copy(alpha = .6f),
                fontWeight = FontWeight.Normal,
                fontFamily = Inter,
                letterSpacing = 0.5.sp,
                lineHeight = 14.sp,
                modifier = Modifier.padding(end = 40.dp)
            )
            Spacer(Modifier.height(26.dp))
            Text(
                text = "Quantity",
                fontSize = 18.sp,
                color = Color.Black.copy(alpha = .8f),
                fontWeight = FontWeight.Medium,
                fontFamily = Inter,
                letterSpacing = 0.sp
            )
            Spacer(Modifier.height(19.dp))
            Row {
                BoxQuantity(
                    text = "-",
                    fontSize = 32.sp,
                    color = Color.White,
                    textColor = Color.Black
                )
                Spacer(Modifier.width(20.dp))
                BoxQuantity(
                    text = "1",
                    fontSize = 22.sp,
                    color = Color.White,
                    textColor = Color.Black
                )
                Spacer(Modifier.width(20.dp))
                BoxQuantity(
                    text = "+",
                    fontSize = 32.sp,
                    color = Color.Black,
                    textColor = Color.White
                )
            }
            Spacer(Modifier.height(45.dp))
            ButtonRow()
        }
    }
}

@Composable
@Preview(showBackground = true)
fun DetailsSectionPreview(){
    DetailsSection()
}