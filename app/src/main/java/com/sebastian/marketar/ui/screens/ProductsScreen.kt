package com.sebastian.marketar.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.sebastian.marketar.ui.AppWrapper
import com.sebastian.marketar.ui.components.footer.Footer
import com.sebastian.marketar.ui.components.header.Header
import com.sebastian.marketar.ui.components.main.MainComponent
import com.sebastian.marketar.ui.components.products.ProductsComponent

@Composable
fun ProductsScreen(navController: NavHostController) {
    //PANTALLA DONDE SE VAN A MOSTRAR TODOS LOS PRODUCTOS DE CADA CATEGORIA
    AppWrapper(
        content = {
            ProductsComponent(navController)
        },
        navController = navController
    )
}