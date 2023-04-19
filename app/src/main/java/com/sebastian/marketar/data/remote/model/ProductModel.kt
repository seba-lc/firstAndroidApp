package com.sebastian.marketar.data.remote.model

data class ProductModel(

    val id: Int,
    val category: String,
    val createdAt: String,
    val delta: Double,
    val image: String,
    val minUnit: Double,
    val price: Int,
    val productName: String,
    val unit: String,
    val updatedAt: String

)
