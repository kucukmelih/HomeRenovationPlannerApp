package com.example.homerenovationplannerapp

import android.util.Log
import com.example.homerenovationplannerapp.ui.theme.Categories
import com.example.homerenovationplannerapp.ui.theme.DetailedCategory
import io.ktor.client.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*

object ApiClient {
    private const val BASE_URL = "http://192.168.1.104:5554"
    private val httpClient = HttpClient(OkHttp) {
        install(JsonFeature) {
            serializer = KotlinxSerializer()
        }
    }

    suspend fun addPlan(plan: Plan): HttpResponse {
        return httpClient.post("$BASE_URL/add_data") {
            contentType(ContentType.Application.Json)
            body = plan
        }
    }

    suspend fun getPlans(): List<Plan> {
        return httpClient.get("$BASE_URL/read_data") {
            contentType(ContentType.Application.Json)
        }
    }

    suspend fun getCategories(): List<Categories> {
        return httpClient.get("$BASE_URL/read_categories") {
            contentType(ContentType.Application.Json)
        }
    }

    suspend fun getDetailedCategory(detailedCategoryID: Int): DetailedCategory {
        return httpClient.get("$BASE_URL/read_detailed_category/$detailedCategoryID") {
            contentType(ContentType.Application.Json)
        }
    }

    suspend fun deletePlan(planId: Int) {
        // Make an HTTP DELETE request to delete the plan
        // Example using Ktor client
        HttpClient().use {
            it.delete<HttpResponse>("$BASE_URL/delete_plan/$planId")
        }
    }

}