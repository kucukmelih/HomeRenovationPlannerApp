package com.example.homerenovationplannerapp.ui.theme
import kotlinx.serialization.Serializable

@Serializable
data class Categories(
    val CategoryID: Int?,
    val CategoryName: String,
    val DetailedCategories: List<DetailedCategory>
)

@Serializable
data class DetailedCategory(
    val DetailedCategoryID: Int,
    val DetailedCategoryName: String,
    val Details: List<Detail>
)

@Serializable
data class Detail(
    val DetailID: Int,
    val Info: String?,
    val Details1: String?,
    val Details2: String?,
    val Details3: String?
)
