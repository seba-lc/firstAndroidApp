package com.sebastian.marketar.ui.components.main

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.sebastian.marketar.helpers.ScreenHeightDp
import com.sebastian.marketar.ui.temporalData.getKindOfProducts

@Composable
fun MainComponent(
    scaffoldState: ScaffoldState,
    navController: NavHostController,
    clientName: String,
    updateClientName: (String) -> Unit
) {
    var clientDefined by remember {
        mutableStateOf(false)
    }

    Column (
        modifier = Modifier
            .height((ScreenHeightDp() - 70).dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
            ) {
        if(!clientDefined) {
            SnackWelcome(scaffoldState, clientName, {updateClientName(it)}) {
                clientDefined = it
            }
        } else {
            Button(onClick = { navController.navigate("landing") }) {
                Text(text = "Ingresar al Market")
            }
        }
    }
}