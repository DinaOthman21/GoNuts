package com.example.gonuts.ui.theme

import com.example.gonuts.R
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)

val Inter = FontFamily(
    Font(R.font.inter_18pt_medium , weight = FontWeight.Medium) ,
    Font(R.font.inter_18pt_bold , weight = FontWeight.Bold) ,
    Font(R.font.inter_18pt_semi_bold , weight = FontWeight.SemiBold)
)