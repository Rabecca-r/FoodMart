package com.example.foodmart.data.model

import com.squareup.moshi.Json

// Raw category shape from API
data class FoodCategoryDto(
    @Json(name = "uuid") val uuid: String,
    @Json(name = "name") val name: String
)
