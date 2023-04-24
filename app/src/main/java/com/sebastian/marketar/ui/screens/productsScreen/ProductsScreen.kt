package com.sebastian.marketar.ui.screens.productsScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.sebastian.marketar.R
import com.sebastian.marketar.domain.item.ProductItem
import com.sebastian.marketar.ui.components.cards.ProductCard
import com.sebastian.marketar.ui.components.productCard.ImageCard
import com.sebastian.marketar.ui.components.products.ProductsComponent
import dagger.hilt.android.AndroidEntryPoint

@Composable
fun ProductsScreen(products: List<ProductItem>) {

    LazyColumn {

        items(products) { product: ProductItem ->

            ProductCard(item = product)

        }

    }

//    ProductsComponent(navController)

}