package com.sebastian.marketar.ui.components.main

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.sebastian.marketar.helpers.ScreenHeightDp
import com.sebastian.marketar.ui.temporalData.getKindOfProducts

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainComponent(navController: NavHostController) {
    Column (
        modifier = Modifier
            .height((ScreenHeightDp() - 70).dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
            ) {
        Text(text = "Acá irá el formulario para poner el nombre")
        Button(onClick = { navController.navigate("landing") }) {
            Text(text = "Ir al Landing")
        }
    }

}