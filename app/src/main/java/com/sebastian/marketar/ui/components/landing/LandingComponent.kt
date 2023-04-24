package com.sebastian.marketar.ui.components.landing

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.rememberImagePainter
import com.sebastian.marketar.helpers.ScreenHeightDp
import com.sebastian.marketar.ui.components.productCard.ImageCard
import com.sebastian.marketar.ui.temporalData.getKindOfProducts

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LandingComponent(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height((ScreenHeightDp() - 70).dp),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        LazyColumn(
            contentPadding = PaddingValues(60.dp),
        ) {
            items(getKindOfProducts()) { item ->
                ImageCard(
                    painter = rememberImagePainter(
                        data = item.url,
                        builder = {
                            crossfade(true)
                        }
                    ),
                    contentDescription = item.title,
                    title = item.title,
//                    navController = navController
                )
            }
        }

    }
}