package com.swyp9.android.presentation.splash.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.swyp9.android.core.common.navigation.Route
import com.swyp9.android.presentation.splash.SplashRoute
import kotlinx.serialization.Serializable

@Serializable
data object Splash : Route

fun NavController.navigateToSplash(
    navOptions: NavOptions? = null,
) {
    navigate(
        route = Splash,
        navOptions = navOptions,
    )
}

fun NavGraphBuilder.splashNavGraph(
    paddingValues: PaddingValues,
    navigateToMissionSelect: () -> Unit,
    navigateToOnboarding: () -> Unit,
) {
    composable<Splash> {
        SplashRoute(
            paddingValues = paddingValues,
            navigateToMissionSelect = navigateToMissionSelect,
            navigateToOnboarding = navigateToOnboarding,
        )
    }
}
