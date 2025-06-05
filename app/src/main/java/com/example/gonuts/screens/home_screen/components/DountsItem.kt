package com.example.gonuts.screens.home_screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gonuts.R
import com.example.gonuts.ui.theme.Inter
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items


data class DountsDetails(
    val image: Int,
    val color: Color,
    val name: String,
    val description: String ,
    val newPrice : Int ,
    val oldPrice : Int
)

val dounts: List<DountsDetails> = listOf(
    DountsDetails(
        image =  R.drawable.donut1 ,
        color = Color(0xFFD7E4F6) ,
        name = "Strawberry Wheel" ,
        description = "These Baked Strawberry Donuts are filled with fresh strawberries..." ,
        newPrice = 16 ,
        oldPrice = 20
    ),
    DountsDetails(
        image =  R.drawable.donut2 ,
        color = Color(0xFFFFC7D0) ,
        name = "Chocolate Glaze" ,
        description = "Moist and fluffy baked chocolate donuts full of chocolate flavor." ,
        newPrice = 16 ,
        oldPrice = 20
    ),
    DountsDetails(
        image =  R.drawable.donut1 ,
        color = Color(0xFFD7E4F6) ,
        name = "Strawberry Wheel" ,
        description = "These Baked Strawberry Donuts are filled with fresh strawberries..." ,
        newPrice = 16 ,
        oldPrice = 20
    )
)

@Composable
fun DountsItem(
    dountsDetails : DountsDetails
){
    Box(
        modifier = Modifier
            .width(229.dp)
    ){
        Card(
            modifier = Modifier
                .width(193.dp) ,
            colors = CardDefaults.cardColors(
                containerColor = dountsDetails.color
            ),
            shape = RoundedCornerShape(20.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .padding(
                            top = 15.dp,
                            start = 15.dp
                        )
                        .clip(CircleShape)
                        .size(35.dp)
                        .background(Color.White)
                ) {
                    Icon(
                        modifier = Modifier.align(Alignment.Center),
                        painter = painterResource(R.drawable.vector),
                        contentDescription = "favourite icon",
                        tint = Color(0xFFFF7074)
                    )
                }
                Text(
                    text = dountsDetails.name,
                    fontSize = 16.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Medium,
                    fontFamily = Inter,
                    modifier = Modifier.padding(
                        top = 162.dp,
                        start = 20.dp
                    )
                )
                Spacer(Modifier.height(9.dp))
                Text(
                    text = dountsDetails.description,
                    fontSize = 12.sp,
                    color = Color.Black.copy(alpha = .6f),
                    fontWeight = FontWeight.Normal,
                    fontFamily = Inter,
                    modifier = Modifier.padding(
                        start = 20.dp,
                        end = 16.dp
                    )
                        .width(156.dp),
                    lineHeight = 16.sp,
                    letterSpacing = 0.7.sp
                )
                Spacer(Modifier.height(5.dp))
                Row(
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(
                            end = 20.dp,
                            bottom = 15.dp
                        ),
                    verticalAlignment = Alignment.Bottom
                ) {
                    Text(
                        text = "$${dountsDetails.oldPrice}",
                        fontSize = 14.sp,
                        color = Color.Black.copy(alpha = .6f),
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = Inter,
                        textDecoration = TextDecoration.LineThrough,
                        lineHeight = 22.sp
                    )
                    Spacer(Modifier.width(5.dp))
                    Text(
                        text = "$${dountsDetails.newPrice}",
                        fontSize = 22.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = Inter,
                        lineHeight = 22.sp,
                    )
                }
            }
        }

        Image(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(top = 25.dp),
            painter = painterResource(id = dountsDetails.image),
            contentDescription = "dount image",
            contentScale = ContentScale.FillBounds
        )
    }
}

@Composable
fun DountsItems(){
    LazyRow(
        modifier = Modifier.fillMaxWidth().padding(start = 38.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
    ) {
        items(dounts) { item ->
            DountsItem(
                dountsDetails = item,
            )
        }
    }
}


@Composable
@Preview(showBackground = true, showSystemUi = true)
fun DountsItemPreview(){
    DountsItems()
   /* DountsItem(
        dountsDetails = DountsDetails(
            image =  R.drawable.donut1 ,
            color = Color(0xFFD7E4F6) ,
            name = "Strawberry Wheel" ,
            description = "These Baked Strawberry Donuts are filled with fresh strawberries..." ,
            newPrice = 16 ,
            oldPrice = 20
        )
    )*/
}

