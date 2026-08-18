package com.swyp9.android.presentation.mission.retrospective.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.swyp9.android.core.common.navigation.Route
import com.swyp9.android.presentation.mission.retrospective.RetrospectiveRoute
import kotlinx.serialization.Serializable

@Serializable
data object Retrospective : Route

fun NavController.navigateToRetrospective(
    navOptions: NavOptions? = null,
) {
    navigate(
        route = Retrospective,
        navOptions = navOptions,
    )
}

fun NavGraphBuilder.retrospectiveNavGraph(
    paddingValues: PaddingValues,
) {
    composable<Retrospective> {
        RetrospectiveRoute(
            paddingValues = paddingValues
        )
    }
}