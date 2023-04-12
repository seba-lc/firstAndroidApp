package com.sebastian.marketar.ui.components.landing

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.sebastian.marketar.helpers.ScreenHeightDp
import com.sebastian.marketar.ui.components.main.LandingCardsContainer
import com.sebastian.marketar.ui.temporalData.getKindOfProducts

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LandingComponent(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Red)
            .height((ScreenHeightDp() - 140).dp),
        horizontalAlignment = Alignment.CenterHorizontally




        ) {
        LazyVerticalGrid(
            cells = GridCells.Fixed(1),
            contentPadding = PaddingValues(60.dp),
            modifier = Modifier.background(Color.Black)

        ) {
            items(getKindOfProducts()) { item ->

                LandingCardsContainer(item.title, navController)
            }

        }

    }


//    Box(
//        modifier = Modifier
//            .height((ScreenHeightDp() - 140).dp)
//            .fillMaxWidth()
//            .background(Color.LightGray),
//        contentAlignment = Alignment.Center
//    ) {
//        Column() {
//            Text(
//                text = "Hi I'm the Landing Screen"
//            )
//            Button(onClick = {navController.navigate("main")}) {
//                Text(text = "Go to Main Page")
//            }
//        }
//    }
}