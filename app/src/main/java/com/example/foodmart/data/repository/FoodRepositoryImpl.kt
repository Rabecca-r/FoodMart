package com.example.foodmart.data.repository

import com.example.foodmart.data.model.FoodCategory
import com.example.foodmart.data.model.FoodItem
import com.example.foodmart.data.remote.FoodApiService
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

// Concrete implementation that uses Retrofit under the hood
class FoodRepositoryImpl(
    private val api: FoodApiService
) : FoodRepository {

    override suspend fun getFoodItemsWithCategories(): List<FoodItem> = coroutineScope {
        // Kick off both calls in parallel – why not, they're independent
        val itemsDeferred = async { api.getFoodItems() }
        val categoriesDeferred = async { api.getFoodCategories() }

        val itemDtos = itemsDeferred.await()
        val categoryDtos = categoriesDeferred.await()

        // Index categories by ID so mapping items becomes trivial
        val categoriesById = categoryDtos.associateBy { it.uuid }
            .mapValues { (_, dto) ->
                FoodCategory(
                    id = dto.uuid,
                    name = dto.name
                )
            }

        // Map DTOs into domain models, skipping items whose category we don't know
        itemDtos.mapNotNull { dto ->
            val category = categoriesById[dto.categoryUuid]
            category?.let {
                FoodItem(
                    id = dto.uuid,
                    name = dto.name,
                    price = dto.price,
                    imageUrl = dto.imageUrl,
                    category = it
                )
            }
        }.sortedBy { it.name } // nice deterministic order
    }
}
