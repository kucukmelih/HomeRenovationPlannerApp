package com.example.homerenovationplannerapp.ui.theme

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.homerenovationplannerapp.ApiClient
import kotlinx.coroutines.launch
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModelProvider
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.runBlocking

class CategoriesViewModel : ViewModel() {
    var categories = mutableStateOf<List<Categories>>(emptyList())
        private set

    var detailedCategory = mutableStateOf<DetailedCategory?>(null)
        private set

    init {
        fetchCategories()
    }

    private fun fetchCategories() {
        viewModelScope.launch {
            try {
                val response = ApiClient.getCategories()
                categories.value = response
                Log.d("CategoriesViewModel", "Fetched categories: $response")
            } catch (e: Exception) {
                Log.e("CategoriesViewModel", "Error fetching categories", e)
            }
        }
    }

    fun fetchDetailedCategory(detailedCategoryID: Int) {
        viewModelScope.launch {
            try {
                val response = ApiClient.getDetailedCategory(detailedCategoryID)
                detailedCategory.value = response
                Log.d("CategoriesViewModel", "Fetched detailed category: $response")
            } catch (e: Exception) {
                Log.e("CategoriesViewModel", "Error fetching detailed category", e)
            }
        }
    }


    class DetailedCategoryViewModel(private val detailedCategoryID: Int) : ViewModel() {
        private val _detailedCategory = MutableStateFlow<DetailedCategory?>(null)
        val detailedCategory: StateFlow<DetailedCategory?> get() = _detailedCategory

        init {
            fetchDetailedCategory()
        }

        private fun fetchDetailedCategory() = runBlocking {
            launch {
                try {
                    val response = ApiClient.getDetailedCategory(detailedCategoryID)
                    _detailedCategory.value = response
                    Log.d("DetailedCategoryViewModel", "Fetched detailed category: $response")
                } catch (e: Exception) {
                    Log.e("DetailedCategoryViewModel", "Error fetching detailed category", e)
                }
            }
        }
    }
    class DetailedCategoryViewModelFactory(private val detailedCategoryID: Int) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(DetailedCategoryViewModel::class.java)) {
                @Suppress("UNCHECKED_CAST")
                return DetailedCategoryViewModel(detailedCategoryID) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }


}
