package com.sebastian.marketar.ui.components.header

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Header () {
    Box(
        modifier = Modifier
            .height(70.dp)
            .fillMaxWidth()
            .background(Color.Blue),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hi I'm the Header"
        )
    }
}