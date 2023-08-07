package com.caleb.wellnessapp

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WaterCounter(modifier: Modifier = Modifier){
    val count=0
    Text(
        text = "You have taken $count glasses of water",
        modifier = Modifier.padding()
    )


}