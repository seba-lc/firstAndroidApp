package com.sebastian.marketar.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.sebastian.marketar.ui.AppWrapper
import com.sebastian.marketar.ui.components.checkout.CheckoutComponent
import com.sebastian.marketar.ui.components.footer.Footer
import com.sebastian.marketar.ui.components.header.Header
import com.sebastian.marketar.ui.components.main.MainComponent

@Composable
fun CheckoutScreen(navController: NavHostController) {
    //PANTALLA DEL CARRITO
    AppWrapper(
        content = {
            CheckoutComponent(navController)
        },
        navController = navController
    )
}