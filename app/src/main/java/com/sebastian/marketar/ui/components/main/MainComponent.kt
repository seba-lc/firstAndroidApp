package com.sebastian.marketar.ui.components.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.sebastian.marketar.helpers.ScreenHeightDp

@Composable
fun MainComponent(navController: NavHostController) {
    Box(
        modifier = Modifier
            .height((ScreenHeightDp() - 140).dp)
            .fillMaxWidth()
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        Column() {
            Text(
                text = "Hi I'm Main Screen"
            )
            Button(onClick = {navController.navigate("landing")}) {
                Text(text = "Go to Landing Page")
            }
        }
    }
}