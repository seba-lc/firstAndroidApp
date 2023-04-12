package com.sebastian.marketar.ui.components.main

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun LandingCardsContainer(title: String, navController: NavHostController) {

    Box(modifier = Modifier.padding(20.dp)) {
        Card (
            elevation = 20.dp,
            shape = RoundedCornerShape(8.dp),
            border = BorderStroke(1.dp, Color.LightGray),
            onClick = {
                navController.navigate("products")
            }
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(30.dp)
            ) {
                Box(
                    modifier = Modifier
                        .height(250.dp)
                        .width(250.dp)
                        .background(Color.LightGray),
                    contentAlignment = Alignment.Center

                ) {

                    Text(
                        text = "Aca van a ir imagenes (dato de argumento)",
                        style = MaterialTheme.typography.h6,
                        textAlign = TextAlign.Center
                    )
                }
                Box(
                    modifier = Modifier
                        .width(250.dp)
                        .background(Color.LightGray)
                        .padding(20.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = title,
                        style = MaterialTheme.typography.h6,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }

}

//ASI INSERTARIA UNA IMAGEN, AHORA NO LO VOY A HACER
//            Image(
//                painter = rememberImagePainter(
//                    data = item.thumb,
//                    builder = {
//                        //transformations(CircleCropTransformation())
//                        crossfade(true)
//                    }
//                ),
//                contentDescription = null,
//                modifier = Modifier.fillMaxSize(),
//                contentScale = ContentScale.Crop
//            );