package com.sebastian.marketar.ui.screens.main

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.sebastian.marketar.ui.AppWrapper
import com.sebastian.marketar.ui.components.footer.Footer
import com.sebastian.marketar.ui.components.header.Header
import com.sebastian.marketar.ui.components.landing.LandingComponent
import com.sebastian.marketar.ui.components.main.MainComponent

@Composable
fun LandingScreen(navController: NavHostController) {
    AppWrapper(
        content = {
            LandingComponent(navController)
        },
        navController = navController
    )
}