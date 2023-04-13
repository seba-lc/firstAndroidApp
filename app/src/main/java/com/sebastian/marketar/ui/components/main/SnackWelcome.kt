package com.sebastian.marketar.ui.components.main

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun SnackWelcome(
    scaffoldState: ScaffoldState,
    clientName: String,
    updateClientName: (String) -> Unit,
    updateDefinedName : (Boolean) -> Unit
) {
    val scope = rememberCoroutineScope()
    var inputEnabled by remember {
        mutableStateOf(true)
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(horizontal = 30.dp)
    ) {
        TextField(
            value = clientName,
            label = {
                Text(text = "Ingresa tu nombre")
            },
            onValueChange = {
                updateClientName(it)
            },
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            enabled = inputEnabled
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            scope.launch {
                inputEnabled = false
                scaffoldState.snackbarHostState.showSnackbar("Hola $clientName, Bienvenid@ a Marketar")
                updateDefinedName(true)
            }

        }) {
            Text(text = "Submit")
        }
    }
}