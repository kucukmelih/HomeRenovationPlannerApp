package com.example.homerenovationplannerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.homerenovationplannerapp.ui.theme.HomeRenovationPlannerAppTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.homerenovationplannerapp.ui.theme.*
import androidx.navigation.NavType
import androidx.navigation.navArgument

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeRenovationPlannerAppTheme {
                SayfaGecisleri()
            }
        }
    }
}

@Composable
fun SayfaGecisleri() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "LoginPage1") {
        composable(route = "LoginPage1") {
            LoginPage1(navController = navController)
        }
        composable(route = "RegisterPage2") {
            RegisterPage2(navController = navController)
        }
        composable(route = "MainPage3") {
            MainPage3(navController = navController)
        }
        composable(route = "Settings4") {
            Settings4(navController = navController)
        }
        composable(route = "HelpCenter5") {
            HelpCenter5(navController = navController)
        }
        composable(route = "AddScreen6") {
            AddScreen6(navController = navController)
        }
        composable(route = "PlansScreen7") {
            PlansScreen7(navController = navController)
        }
        composable(
            route = "PlanDetailsScreen8/{planId}",
            arguments = listOf(navArgument("planId") { type = NavType.IntType })
        ) { backStackEntry ->
            val planId = backStackEntry.arguments?.getInt("planId")
            PlanDetailsScreen8(planId = planId, navController = navController)
        }
        composable(route = "StorePage9") {
            StorePage9(navController = navController)
        }
        composable(route = "WorkersPage10") {
            WorkersPage10(navController = navController)
        }
        composable(route = "ShoppingCart11") {
            ShoppingCart11(navController = navController)
        }
        composable(route = "Search112") {
            Search112(navController = navController)
        }
        composable(
            route = "Search213/{CategoryID}",
            arguments = listOf(navArgument("CategoryID") { type = NavType.IntType })
        ) { backStackEntry ->
            val categoryID = backStackEntry.arguments?.getInt("CategoryID")
            Search213(categoryID = categoryID, navController = navController)
        }
        composable(
            route = "Search314/{DetailedCategoryID}",
            arguments = listOf(navArgument("DetailedCategoryID") { type = NavType.IntType })
        ) { backStackEntry ->
            val detailedCategoryID = backStackEntry.arguments?.getInt("DetailedCategoryID")
            Search314(detailedCategoryID = detailedCategoryID, navController = navController)
        }
        composable(
            route = "Search4115/{details1}",
            arguments = listOf(navArgument("details1") { type = NavType.StringType })
        ) { backStackEntry ->
            val details1 = backStackEntry.arguments?.getString("details1")
            Search4115(details1 = details1, navController = navController)
        }
        composable(
            route = "Search4216/{details2}",
            arguments = listOf(navArgument("details2") { type = NavType.StringType })
        ) { backStackEntry ->
            val details2 = backStackEntry.arguments?.getString("details2")
            Search4216(details2 = details2, navController = navController)
        }
        composable(
            route = "Search4317/{details3}",
            arguments = listOf(navArgument("details3") { type = NavType.StringType })
        ) { backStackEntry ->
            val details3 = backStackEntry.arguments?.getString("details3")
            Search4317(details3 = details3, navController = navController)
        }
        // Ensure the Details3Screen is defined
        composable(
            route = "Details3Screen/{details3}",
            arguments = listOf(navArgument("details3") { type = NavType.StringType })
        ) { backStackEntry ->
            val details3 = backStackEntry.arguments?.getString("details3")
            Details3Screen(details3 = details3, navController = navController)
        }
    }
}

