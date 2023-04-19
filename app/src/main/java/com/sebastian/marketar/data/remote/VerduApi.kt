package com.sebastian.marketar.data.remote

import com.sebastian.marketar.data.remote.model.ProductModel
import com.sebastian.marketar.util.Constants.Companion.PRODUCTS_ENDPOINT
import retrofit2.Response
import retrofit2.http.GET

interface VerduApi {

    @GET(PRODUCTS_ENDPOINT)
    suspend fun getProducts() : Response<List<ProductModel>>

}