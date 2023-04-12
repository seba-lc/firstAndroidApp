package com.sebastian.marketar.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.sebastian.marketar.MarketarApp
import com.sebastian.marketar.ui.components.products.ProductsComponent

@Composable
fun ProductsScreen(navController: NavHostController) {
    //PANTALLA DONDE SE VAN A MOSTRAR TODOS LOS PRODUCTOS DE CADA CATEGORIA
    MarketarApp {
        ProductsComponent(navController)
    }
}