package com.example.foodmart.data.model

import com.squareup.moshi.Json

// Raw item shape coming directly from the API
data class FoodItemDto(
    @Json(name = "uuid") val uuid: String,
    @Json(name = "name") val name: String,
    @Json(name = "price") val price: Double,
    @Json(name = "category_uuid") val categoryUuid: String,
    @Json(name = "image_url") val imageUrl: String
)
