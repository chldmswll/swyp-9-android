package com.swyp9.android.presentation.signin.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.swyp9.android.core.common.navigation.Route
import com.swyp9.android.presentation.mission.select.MissionSelectRoute
import com.swyp9.android.presentation.signin.SignInRoute
import kotlinx.serialization.Serializable

@Serializable
data object SignIn: Route

fun NavController.navigateToSignIn(
    navOptions: NavOptions? = null,
) {
    navigate(
        route = SignIn,
        navOptions = navOptions,
    )
}

fun NavGraphBuilder.signInNavGraph(
    paddingValues: PaddingValues,
) {
    composable<SignIn> {
        SignInRoute(
            paddingValues = paddingValues
        )
    }
}