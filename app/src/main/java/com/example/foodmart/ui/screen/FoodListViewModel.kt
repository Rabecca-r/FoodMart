package com.example.foodmart.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.foodmart.data.model.FoodCategory
import com.example.foodmart.data.model.FoodItem
import com.example.foodmart.data.repository.FoodRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

// UI state for the screen
data class FoodListUiState(
    val isLoading: Boolean = false,
    val allItems: List<FoodItem> = emptyList(),
    val visibleItems: List<FoodItem> = emptyList(),
    val categories: List<FoodCategory> = emptyList(),
    val selectedCategoryIds: Set<String> = emptySet(),
    val errorMessage: String? = null
)

// ViewModel for the screen
class FoodListViewModel(
    private val repository: FoodRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(FoodListUiState(isLoading = true))
    val uiState: StateFlow<FoodListUiState> = _uiState

    init {
        // as soon as VM is created, hit the API
        refresh()
    }

    // Pull fresh data from the API
    fun refresh() {
        _uiState.update { it.copy(isLoading = true, errorMessage = null) }

        viewModelScope.launch {
            try {
                val items = repository.getFoodItemsWithCategories()

                // derive categories from the data so they always stay in sync
                val categories = items
                    .map { it.category }
                    .distinctBy { it.id }
                    .sortedBy { it.name }

                _uiState.update {
                    it.copy(
                        isLoading = false,
                        allItems = items,
                        visibleItems = items,
                        categories = categories,
                        selectedCategoryIds = emptySet(),
                        errorMessage = null
                    )
                }
            } catch (e: Exception) {
                // something went wrong, show error message
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        errorMessage = e.message ?: "Something went wrong"
                    )
                }
            }
        }
    }

    // Toggle a single category on/off
    fun toggleCategory(categoryId: String) {
        _uiState.update { current ->
            val newSelected = current.selectedCategoryIds.toMutableSet().apply {
                if (contains(categoryId)) remove(categoryId) else add(categoryId)
            }

            // If nothing is selected, show everything; otherwise filter
            val filtered = if (newSelected.isEmpty()) {
                current.allItems
            } else {
                current.allItems.filter { it.category.id in newSelected }
            }

            current.copy(
                selectedCategoryIds = newSelected,
                visibleItems = filtered
            )
        }
    }

    // Clear all category filters with one tap
    fun clearFilters() {
        _uiState.update { current ->
            current.copy(
                selectedCategoryIds = emptySet(),
                visibleItems = current.allItems
            )
        }
    }

    // Helper for the detail screen: grab one item from the cached list
    fun getItemById(id: String): FoodItem? {
        return _uiState.value.allItems.find { it.id == id }
    }
}
