package com.sebastian.marketar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.zIndex
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sebastian.marketar.ui.components.footer.Footer
import com.sebastian.marketar.ui.components.header.*
import com.sebastian.marketar.ui.screens.CheckoutScreen
import com.sebastian.marketar.ui.screens.ProductsScreen
import com.sebastian.marketar.ui.screens.main.LandingScreen
import com.sebastian.marketar.ui.screens.main.MainScreen
import com.sebastian.marketar.ui.theme.MarketarTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() { // KOTLIN | en este caso los : se traducen como que MainActivity es una extension de la clase ComponentActivity
    override fun onCreate(savedInstanceState: Bundle?) { // KOTLIN | en este caso se define el nombre de la variable : el tipo de variable. En JAVA seria al reves: primero el tipo de variable y despues el nombre
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController();
            NavHost(navController = navController, startDestination = "main") {
                composable("main") {
                    MainScreen(navController);
                }
                composable("landing") {
                    LandingScreen(navController);
                }
                composable("products") {
                    ProductsScreen(navController);
                }
                composable("checkout") {
                    CheckoutScreen(navController);
                }
            }
        }
    }
}



