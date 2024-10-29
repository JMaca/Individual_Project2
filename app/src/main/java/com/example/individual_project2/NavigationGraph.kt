package com.example.individual_project2

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationGraph(
    navController: NavHostController,
    onBottomBarVisibilityChanged: (Boolean) -> Unit
) {
    NavHost(navController, startDestination = BottomNavigationItems.Welcome.route) {
        composable(BottomNavigationItems.Welcome.route) {
            onBottomBarVisibilityChanged(false)
            SplashScreen(navController = navController)
        }
        composable(BottomNavigationItems.LogScreen.route) {
            onBottomBarVisibilityChanged(true)
            LoginScreen(navController = navController)
        }
        composable(BottomNavigationItems.SignupScreen.route) {
            onBottomBarVisibilityChanged(true)
            SignUpScreen(navController = navController)
        }
        composable(BottomNavigationItems.QuizScreen.route) {
            onBottomBarVisibilityChanged(true)
            QuizScreen()
        }
    }
}

// ToDo 8: This is the homework:
// add a drawer navigation as described in drawable drawermenu.png
// Improve the design and integration of the app for 5 extra credit points.

@Composable
fun DrawerNav()
{
    val drawerState = rememberDrawerState(DrawerValue.Closed)
}

