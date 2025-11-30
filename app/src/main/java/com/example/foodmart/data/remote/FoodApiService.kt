package com.example.foodmart.data.remote

import com.example.foodmart.data.model.FoodCategoryDto
import com.example.foodmart.data.model.FoodItemDto
import retrofit2.http.GET

// Simple Retrofit service for this take-home API
interface FoodApiService {

    // returns a flat list of food items
    @GET("food_items.json")
    suspend fun getFoodItems(): List<FoodItemDto>

    // returns all categories
    @GET("food_item_categories.json")
    suspend fun getFoodCategories(): List<FoodCategoryDto>

    companion object {
        // base URL for everything in this challenge
        const val BASE_URL = "https://7shifts.github.io/mobile-takehome/api/"
    }
}
