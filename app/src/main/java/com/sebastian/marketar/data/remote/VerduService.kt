package com.sebastian.marketar.data.remote

import com.sebastian.marketar.data.remote.model.ProductModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class VerduService @Inject constructor(private val verduApi: VerduApi){

    suspend fun getProducts() : List<ProductModel> {

        return withContext(Dispatchers.IO) {
            val products = verduApi.getProducts()
            products.body() ?: emptyList()
        }

    }

}