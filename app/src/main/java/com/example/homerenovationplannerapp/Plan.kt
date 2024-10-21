package com.example.homerenovationplannerapp
import kotlinx.serialization.Serializable

@Serializable
data class Plan(
    val PlanID: Int?,
    val PlanTitle: String,
    val Description: String,
    val Cost: String,
    val Date: String
)
