package com.swyp9.android.presentation.main.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavOptions
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.swyp9.android.presentation.main.type.MainTab
import com.swyp9.android.presentation.mission.complete.navigation.navigateToMissionComplete
import com.swyp9.android.presentation.mission.detail.navigation.navigateToMissionDetail
import com.swyp9.android.presentation.mission.photo.navigation.navigateToPhotoPicker
import com.swyp9.android.presentation.mission.retrospective.navigation.navigateToRetrospective
import com.swyp9.android.presentation.mission.select.navigation.MissionSelect
import com.swyp9.android.presentation.mission.select.navigation.navigateToMissionSelect
import com.swyp9.android.presentation.onboarding.navigation.navigateToOnboarding
import com.swyp9.android.presentation.record.navigation.navigateToRecord
import com.swyp9.android.presentation.signin.navigation.navigateToSignIn
import com.swyp9.android.presentation.splash.navigation.Splash
import com.swyp9.android.presentation.splash.navigation.navigateToSplash
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

@Stable
class MainAppState(
    val navController: NavHostController,
    coroutineScope: CoroutineScope,
) {
    val startDestination = Splash

    private val clearStackNavOptions = navOptions {
        popUpTo(0) { inclusive = true }
        launchSingleTop = true
        restoreState = false
    }

    private val keepStackNavOptions = navOptions {
        launchSingleTop = true
        restoreState = true
    }

    private val currentDestination = navController.currentBackStackEntryFlow
        .map { it.destination }
        .stateIn(
            scope = coroutineScope,
            started = SharingStarted.WhileSubscribed(5_000),
            initialValue = null,
        )

    val currentTab: StateFlow<MainTab?> = currentDestination
        .map { destination ->
            MainTab.find { route ->
                destination?.hasRoute(route) == true
            }
        }
        .stateIn(
            scope = coroutineScope,
            started = SharingStarted.WhileSubscribed(5_000),
            initialValue = null,
        )

    fun navigate(tab: MainTab) {
        if (currentTab.value == tab) return

        val navOptions = navOptions {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            restoreState = true
            launchSingleTop = true
        }

        when (tab) {
            MainTab.MISSION -> navController.navigateToMissionSelect(navOptions = navOptions)
            MainTab.RECORD -> navController.navigateToRecord(navOptions = navOptions)
        }
    }

    fun navigateToSplash(navOptions: NavOptions? = clearStackNavOptions) {
        navController.navigateToSplash(navOptions = navOptions)
    }

    fun navigateToSignIn(navOptions: NavOptions? = clearStackNavOptions) {
        navController.navigateToSignIn(navOptions = navOptions)
    }

    fun navigateToMissionSelect(navOptions: NavOptions? = clearStackNavOptions) {
        navController.navigateToMissionSelect(navOptions = navOptions)
    }

    fun navigateToMissionComplete(navOptions: NavOptions? = clearStackNavOptions) {
        navController.navigateToMissionComplete(navOptions = navOptions)
    }

    fun navigateToMissionDetail(navOptions: NavOptions? = clearStackNavOptions) {
        navController.navigateToMissionDetail(navOptions = navOptions)
    }

    fun navigateToPhotoPicker(navOptions: NavOptions? = keepStackNavOptions) {
        navController.navigateToPhotoPicker(navOptions = navOptions)
    }

    fun navigateToRetrospective(navOptions: NavOptions? = keepStackNavOptions) {
        navController.navigateToRetrospective(navOptions = navOptions)
    }

    fun navigateToRecord(navOptions: NavOptions? = keepStackNavOptions) {
        navController.navigateToRecord(navOptions = navOptions)
    }

    fun navigateToOnboarding(navOptions: NavOptions? = keepStackNavOptions) {
        navController.navigateToOnboarding(navOptions = navOptions)
    }

    fun navigateUp() {
        navController.navigateUp()
    }
}

@Composable
fun rememberMainAppState(
    navController: NavHostController = rememberNavController(),
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
): MainAppState = remember(navController, coroutineScope) {
    MainAppState(
        navController = navController,
        coroutineScope = coroutineScope,
    )
}