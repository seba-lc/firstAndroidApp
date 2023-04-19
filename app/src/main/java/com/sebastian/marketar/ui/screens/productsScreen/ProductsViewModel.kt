package com.sebastian.marketar.ui.screens.productsScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sebastian.marketar.domain.GetProductUseCase
import com.sebastian.marketar.domain.item.ProductItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductsViewModel @Inject constructor(private val getProductUseCase: GetProductUseCase) : ViewModel() {

    private val _products = MutableStateFlow(emptyList<ProductItem>())
    val products : StateFlow<List<ProductItem>> get() = _products

    init {
        getProducts()
    }

    private fun getProducts() {
        viewModelScope.launch {
            try {
                val products = getProductUseCase()
                _products.value = products
            } catch (_: Exception) {}
        }
    }

}