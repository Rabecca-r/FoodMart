package com.example.foodmart.data.remote

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

// Tiny "DI" object so I don't have to set up Hilt just for this
object NetworkModule {

    // Moshi with Kotlin adapter so Retrofit understands Kotlin data classes
    private val moshi: Moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    // Basic log for requests (handy during the interview)
    private val logging = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BASIC
    }

    // OkHttp client with logging attached
    private val okHttpClient: OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(logging)
        .build()

    // Retrofit instance pointed at the take-home base URL
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(FoodApiService.BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .client(okHttpClient)
        .build()

    // Public API I will inject into my repository
    val foodApiService: FoodApiService = retrofit.create(FoodApiService::class.java)
}
