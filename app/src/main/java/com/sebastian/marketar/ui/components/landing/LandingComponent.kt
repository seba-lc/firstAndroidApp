package com.sebastian.marketar.ui.components.landing

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
import com.sebastian.marketar.helpers.ScreenHeightDp

@Composable
fun LandingComponent() {
    Box(
        modifier = Modifier
            .height((ScreenHeightDp() -140).dp)
            .fillMaxWidth()
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hi I'm the Landing Screen"
        )
    }
}