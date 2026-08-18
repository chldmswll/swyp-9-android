package com.swyp9.android.presentation.mission.select.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.swyp9.android.core.common.navigation.MainTabRoute
import com.swyp9.android.presentation.mission.select.MissionSelectRoute
import kotlinx.serialization.Serializable

@Serializable
data object MissionSelect : MainTabRoute

fun NavController.navigateToMissionSelect(
    navOptions: NavOptions? = null,
) {
    navigate(
        route = MissionSelect,
        navOptions = navOptions,
    )
}

fun NavGraphBuilder.missionSelectNavGraph(
    paddingValues: PaddingValues,
) {
    composable<MissionSelect> {
        MissionSelectRoute(
            paddingValues = paddingValues
        )
    }
}