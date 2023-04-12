package com.sebastian.marketar.ui.components.header

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.navigation.NavHostController
import kotlinx.coroutines.launch

@Composable
fun Header(navController: NavHostController) {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            AppBar(
                onNavigationIconClick = {
                    scope.launch {
                        scaffoldState.drawerState.open()
                    }
                }
            )
        },
        drawerGesturesEnabled = scaffoldState.drawerState.isOpen,
        drawerContent = {
            NavigationDrawer()
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
                }
            )
        }
    ) {

    }
}


//    Box(
//        modifier = Modifier
//            .height(70.dp)
//            .fillMaxWidth()
//            .background(Color.Blue),
//        contentAlignment = Alignment.Center
//    ) {
//        Text(
//            text = "Hi I'm the Header"
//        )
//    }
