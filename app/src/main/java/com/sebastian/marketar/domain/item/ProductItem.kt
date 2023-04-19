package com.sebastian.marketar.domain.item

import com.sebastian.marketar.data.remote.model.ProductModel

data class ProductItem(

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

fun ProductModel.toProductItem() = ProductItem(category, createdAt, delta, image, minUnit, price, productName, unit, updatedAt)