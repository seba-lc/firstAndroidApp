package com.sebastian.marketar.repo

import com.sebastian.marketar.data.remote.VerduService
import com.sebastian.marketar.domain.item.ProductItem
import com.sebastian.marketar.domain.item.toProductItem
import javax.inject.Inject

class VerduRepository @Inject constructor(private val verduService: VerduService) {

    suspend fun getProducts() : List<ProductItem> {

        return verduService.getProducts().map {
            it.toProductItem()
        }

    }

}