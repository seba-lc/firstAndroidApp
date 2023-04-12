package com.sebastian.marketar.ui.components.checkout

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
fun CheckoutComponent(navController: NavHostController) {
    Column(
        modifier = Modifier
            .height((ScreenHeightDp() - 70).dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Acá habrá un listado con los productos seleccionados y los precios")
        Spacer(modifier = Modifier.height(100.dp).fillMaxWidth())
        Button(onClick = { /*ACÁ VOY A HACER EL SNACKBAR DE COMPONENT TRIAL*/ }) {
            Text(text = "Pagar")
        }
    }
}