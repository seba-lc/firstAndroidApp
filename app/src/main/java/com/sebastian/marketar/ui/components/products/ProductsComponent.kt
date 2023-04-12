package com.sebastian.marketar.ui.components.products

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
fun ProductsComponent(navController: NavHostController) {
    Column(
        modifier = Modifier
            .height((ScreenHeightDp() - 140).dp)
            .fillMaxWidth()
            .background(Color.Green),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Acá habrá un listado de ImageCards con los productos y sus fotos")
        Spacer(modifier = Modifier.height(100.dp).fillMaxWidth())
        Button(onClick = { navController.navigate("checkout") }) {
            Text(text = "Carrito")
        }
    }
}