package com.sebastian.marketar.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.sebastian.marketar.MarketarApp
import com.sebastian.marketar.ui.components.checkout.CheckoutComponent

@Composable
fun CheckoutScreen(navController: NavHostController) {
    //PANTALLA DEL CARRITO
    MarketarApp {
        CheckoutComponent(navController)
    }
}