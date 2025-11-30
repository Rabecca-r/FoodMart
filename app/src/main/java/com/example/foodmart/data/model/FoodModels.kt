package com.example.foodmart.data.model

// Clean domain models I actually want to use in the UI

data class FoodCategory(
    val id: String,
    val name: String
)

data class FoodItem(
    val id: String,
    val name: String,
    val price: Double,
    val imageUrl: String,
    val category: FoodCategory
)
