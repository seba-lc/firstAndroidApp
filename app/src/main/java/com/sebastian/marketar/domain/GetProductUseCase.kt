package com.sebastian.marketar.domain

import com.sebastian.marketar.domain.item.ProductItem
import com.sebastian.marketar.repo.VerduRepository
import javax.inject.Inject

class GetProductUseCase @Inject constructor(private val verduRepository: VerduRepository) {

    suspend operator fun invoke() : List<ProductItem> {

        return verduRepository.getProducts().shuffled()

    }

}