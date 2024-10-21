package com.example.homerenovationplannerapp.ui.theme

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.homerenovationplannerapp.ApiClient
import com.example.homerenovationplannerapp.Plan
import kotlinx.coroutines.launch

class PlansViewModel : ViewModel() {
    var plans = mutableStateOf<List<Plan>>(emptyList())
        private set

    init {
        fetchPlans()
    }

    private fun fetchPlans() {
        viewModelScope.launch {
            try {
                val response = ApiClient.getPlans()
                plans.value = response
                Log.d("PlansViewModel", "Fetched plans: $response")
            } catch (e: Exception) {
                Log.e("PlansViewModel", "Error fetching plans", e)
            }
        }
    }
    fun deletePlan(planId: Int) {
        viewModelScope.launch {
            try {
                ApiClient.deletePlan(planId)
                fetchPlans() // Refresh the list after deletion
                Log.d("PlansViewModel", "Plan deleted: $planId")
            } catch (e: Exception) {
                Log.e("PlansViewModel", "Error deleting plan", e)
            }
        }
    }

}
