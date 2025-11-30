package com.example.foodmart.data.repository

import com.example.foodmart.data.model.FoodItem

// Repository surface area my ViewModel talks to
interface FoodRepository {
    // returns items already stitched with their categories
    suspend fun getFoodItemsWithCategories(): List<FoodItem>
}
