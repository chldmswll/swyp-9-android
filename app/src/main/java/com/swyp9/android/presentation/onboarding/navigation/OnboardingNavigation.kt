package com.swyp9.android.presentation.onboarding.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.swyp9.android.core.common.navigation.Route
import com.swyp9.android.presentation.onboarding.OnboardingRoute
import com.swyp9.android.presentation.signin.SignInRoute
import kotlinx.serialization.Serializable

@Serializable
data object Onboarding : Route

fun NavController.navigateToOnboarding(
    navOptions: NavOptions? = null,
) {
    navigate(
        route = Onboarding,
        navOptions = navOptions,
    )
}

fun NavGraphBuilder.onboardingNavGraph(
    paddingValues: PaddingValues,
) {
    composable<Onboarding> {
        OnboardingRoute(
            paddingValues = paddingValues
        )
    }
}