package com.sebastian.marketar.ui

import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavHostController
import com.sebastian.marketar.ui.components.header.*
import kotlinx.coroutines.launch

@Composable
fun AppWrapper(content: @Composable () -> Unit, navController: NavHostController, clientName: String, scaffoldState: ScaffoldState) {
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            Header(
                onNavigationIconClick = {
                    scope.launch {
                        scaffoldState.drawerState.open()
                    }
                }
            )
        },
        drawerGesturesEnabled = scaffoldState.drawerState.isOpen,
        drawerContent = {
            NavigationDrawer(clientName)
            DrawerBody(
                items = listOf(
                    MenuItem(
                        id = "main",
                        title = "Home",
                        contentDescription = "Go to Home Screen",
                        icon = Icons.Default.Home
                    ),
                    MenuItem(
                        id = "landing",
                        title = "Landing",
                        contentDescription = "Go to Landing Screen",
                        icon = Icons.Default.List
                    ),
                    MenuItem(
                        id = "products",
                        title = "Products",
                        contentDescription = "Go to Products Screen",
                        icon = Icons.Default.Info
                    ),
                    MenuItem(
                        id = "checkout",
                        title = "Checkout",
                        contentDescription = "Go to Checkout Screen",
                        icon = Icons.Default.ShoppingCart
                    ),
                ),
                onItemClick = {
                    navController.navigate(it.id)
                    scope.launch {
                        scaffoldState.drawerState.close()
                    }
                },
            )
        },
    ) {
        content()
    }
}