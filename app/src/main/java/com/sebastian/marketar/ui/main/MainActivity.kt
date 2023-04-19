package com.sebastian.marketar.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sebastian.marketar.ui.AppWrapper
import com.sebastian.marketar.ui.screens.CheckoutScreen
import com.sebastian.marketar.ui.screens.main.LandingScreen
import com.sebastian.marketar.ui.screens.main.MainScreen
import com.sebastian.marketar.ui.screens.productsScreen.ProductsScreen
import com.sebastian.marketar.ui.screens.productsScreen.ProductsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity :
    ComponentActivity() { // KOTLIN | en este caso los : se traducen como que MainActivity es una extension de la clase ComponentActivity
    override fun onCreate(savedInstanceState: Bundle?) { // KOTLIN | en este caso se define el nombre de la variable : el tipo de variable. En JAVA seria al reves: primero el tipo de variable y despues el nombre
        super.onCreate(savedInstanceState)
        setContent {

            val productScreenViewModel = viewModel(modelClass = ProductsViewModel::class.java)
            val products by productScreenViewModel.products.collectAsState()

            val navController = rememberNavController();
            var clientName by remember {
                mutableStateOf("")
            }

            val scaffoldState = rememberScaffoldState()


            AppWrapper(
                content = {
                    NavHost(navController = navController, startDestination = "main") {
                        composable("main") {
                            MainScreen(scaffoldState, navController, clientName){
                                clientName = it
                            }
                        }
                        composable("landing") {
                            LandingScreen(navController, clientName);
                        }
                        composable("products") {
                            ProductsScreen(products);
                        }
                        composable("checkout") {
                            CheckoutScreen(navController, clientName);
                        }
                    }
                },
                navController = navController,
                clientName = clientName,
                scaffoldState = scaffoldState
            )

        }
    }
}



