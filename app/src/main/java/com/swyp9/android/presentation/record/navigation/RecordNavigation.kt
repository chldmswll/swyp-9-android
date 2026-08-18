package com.swyp9.android.presentation.record.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.swyp9.android.core.common.navigation.MainTabRoute
import com.swyp9.android.presentation.record.RecordRoute
import kotlinx.serialization.Serializable

@Serializable
data object Record : MainTabRoute

fun NavController.navigateToRecord(
    navOptions: NavOptions? = null,
) {
    navigate(
        route = Record,
        navOptions = navOptions,
    )
}

fun NavGraphBuilder.recordNavGraph(
    paddingValues: PaddingValues,
) {
    composable<Record> {
        RecordRoute(
            paddingValues = paddingValues
        )
    }
}