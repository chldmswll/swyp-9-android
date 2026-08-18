package com.swyp9.android.presentation.mission.complete.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.swyp9.android.core.common.navigation.Route
import com.swyp9.android.presentation.mission.complete.MissionCompleteRoute
import kotlinx.serialization.Serializable

@Serializable
data object MissionComplete : Route

fun NavController.navigateToMissionComplete(
    navOptions: NavOptions? = null,
) {
    navigate(
        route = MissionComplete,
        navOptions = navOptions,
    )
}

fun NavGraphBuilder.missionCompleteNavGraph(
    paddingValues: PaddingValues,
) {
    composable<MissionComplete> {
        MissionCompleteRoute(
            paddingValues = paddingValues,
        )
    }
}