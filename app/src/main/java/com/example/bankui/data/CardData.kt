package com.example.bankui.data

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

data class CardData(
    val cardType : String,
    val cardNumber : String,
    val cardName : String,
    val balance : Double,
    val color: Brush,

)
