package com.sebastian.marketar.ui.temporalData

fun getKindOfProducts() : List<KindOfProducts> = listOf(
    KindOfProducts(1,"FRUTAS", "https://storage.googleapis.com/marketar_bucket/not-products/fruit-category.webp"),
    KindOfProducts(2, "VERDURAS", "https://storage.googleapis.com/marketar_bucket/not-products/vegget-category.webp"),
    KindOfProducts(3, "FRUTAS DE ESTACION", "https://storage.googleapis.com/marketar_bucket/not-products/herbs-category.webp"),
)