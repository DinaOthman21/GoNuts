package com.example.gonuts.screens.home_screen.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gonuts.R
import com.example.gonuts.ui.theme.Inter


data class DountCardDetails(
    val image: Int,
    val name: String,
    val price : Int
)

val dountData: List<DountCardDetails> = listOf(
    DountCardDetails(
        image =R.drawable.small_donut1,
        name = "Chocolate Cherry",
        price = 22
    ),
    DountCardDetails(
        image =R.drawable.small_dount2,
        name = "Strawberry Rain",
        price = 22
    ),
    DountCardDetails(
        image =R.drawable.small_donut3,
        name = "Strawberry ",
        price = 22
    )
)

@Composable
fun DountCard(
    dountCardDetails: DountCardDetails
){
    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier.width(138.dp)
    ){
        Card(
            modifier = Modifier
                .padding(top = 56.dp)
                .height(111.dp)
                .fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            shape = RoundedCornerShape(
                topStart = 20.dp,
                topEnd = 20.dp,
                bottomEnd = 10.dp,
                bottomStart = 10.dp
            )
        ) {
            Column(
                modifier = Modifier
                    .padding(top = 40.dp, start = 11.dp , end = 9.dp , bottom = 18.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    dountCardDetails.name,
                    fontSize = 14.sp,
                    color = Color.Black.copy(alpha = .6f),
                    fontWeight = FontWeight.Medium,
                    fontFamily = Inter,
                    letterSpacing = 0.sp,
                )
                Spacer(Modifier.height(10.dp))
                Text(
                    text = "$${dountCardDetails.price}",
                    fontSize = 14.sp,
                    color = Color(0xFFFF7074),
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = Inter,
                    textAlign = TextAlign.Center,
                    letterSpacing = 0.sp,
                )
            }
        }
        Image(
            painter = painterResource(id = dountCardDetails.image) ,
            contentDescription = "donut image",
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(end = 11.dp)
                .height(112.dp),
            contentScale = ContentScale.Crop,
        )
    }
}

@Composable
fun DountCards(){
    LazyRow(
        modifier = Modifier.fillMaxWidth().padding(start = 38.dp),
        horizontalArrangement = Arrangement.spacedBy(21.dp),
    ) {
        items(dountData) { item ->
            DountCard(
                dountCardDetails = item,
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun DountsCardPreview(){
    DountCards()
    /*DountCard(
        dountCardDetails = dountData[0]
    )*/
}