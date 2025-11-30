package com.example.foodmart.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.foodmart.data.remote.NetworkModule
import com.example.foodmart.data.repository.FoodRepositoryImpl

// Tiny factory so I can create the VM with my custom Repository without Hilt
@Suppress("UNCHECKED_CAST")
class FoodListViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val repo = FoodRepositoryImpl(NetworkModule.foodApiService)
        return FoodListViewModel(repo) as T
    }
}
