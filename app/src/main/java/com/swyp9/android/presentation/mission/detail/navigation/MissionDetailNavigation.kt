package com.swyp9.android.presentation.mission.detail.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.swyp9.android.core.common.navigation.Route
import com.swyp9.android.presentation.mission.detail.MissionDetailRoute
import com.swyp9.android.presentation.mission.photo.PhotoPickerRoute
import kotlinx.serialization.Serializable

@Serializable
data object MissionDetail : Route

fun NavController.navigateToMissionDetail(
    navOptions: NavOptions? = null,
) {
    navigate(
        route = MissionDetail,
        navOptions = navOptions,
    )
}

fun NavGraphBuilder.missionDetailNavGraph(
    paddingValues: PaddingValues,
) {
    composable<MissionDetail> {
        MissionDetailRoute(
            paddingValues = paddingValues
        )
    }
}