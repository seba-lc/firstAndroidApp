package com.sebastian.marketar.ui.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.sebastian.marketar.helpers.ScreenHeightDp
import com.sebastian.marketar.ui.components.footer.Footer
import com.sebastian.marketar.ui.components.header.Header
import com.sebastian.marketar.ui.components.main.MainComponent

@Composable
fun MainScreen(navController: NavHostController) {
    Header(navController)
    Column {
        MainComponent(navController)
        Footer()
    }
}