package com.example.foodmart.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.foodmart.ui.screen.FoodDetailScreen
import com.example.foodmart.ui.screen.FoodListScreen
import com.example.foodmart.ui.screen.FoodListViewModel
import com.example.foodmart.ui.screen.FoodListViewModelFactory
import com.example.foodmart.ui.screen.SplashScreen   // 👈 add this import

// Central place for all routes so they're not magic strings everywhere we navigate
object FoodDestinations {
    const val SPLASH = "splash"
    const val FOOD_LIST = "food_list"
    const val FOOD_DETAIL = "food_detail/{itemId}"

    // Helper to build a concrete detail route for a given item
    fun detailRoute(itemId: String) = "food_detail/$itemId"
}

@Composable
fun FoodNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    // Single shared VM between list + detail so we don't refetch
    val foodListViewModel: FoodListViewModel =
        viewModel(factory = FoodListViewModelFactory())

    NavHost(
        navController = navController,
        startDestination = FoodDestinations.SPLASH,  // 👈 start on splash
        modifier = modifier
    ) {
        // Splash screen – shows shrimp hero then goes to list
        composable(FoodDestinations.SPLASH) {
            SplashScreen(
                onFinished = {
                    navController.navigate(FoodDestinations.FOOD_LIST) {
                        // remove splash from back stack so back button doesn't return to it
                        popUpTo(FoodDestinations.SPLASH) { inclusive = true }
                    }
                }
            )
        }

        // Main list screen
        composable(FoodDestinations.FOOD_LIST) {
            FoodListScreen(
                viewModel = foodListViewModel,
                onItemClick = { itemId ->
                    navController.navigate(FoodDestinations.detailRoute(itemId))
                }
            )
        }

        // Detail screen, driven by an item ID in the route
        composable(
            route = FoodDestinations.FOOD_DETAIL,
            arguments = listOf(
                navArgument("itemId") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val itemId = backStackEntry.arguments?.getString("itemId")
            val item = itemId?.let { foodListViewModel.getItemById(it) }

            FoodDetailScreen(
                foodItem = item,
                onBack = { navController.popBackStack() }
            )
        }
    }
}
