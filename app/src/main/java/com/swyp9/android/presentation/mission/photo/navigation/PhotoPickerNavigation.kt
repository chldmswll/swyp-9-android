package com.swyp9.android.presentation.mission.photo.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.swyp9.android.core.common.navigation.Route
import com.swyp9.android.presentation.mission.photo.PhotoPickerRoute
import kotlinx.serialization.Serializable

@Serializable
data object PhotoPicker : Route

fun NavController.navigateToPhotoPicker(
    navOptions: NavOptions? = null,
) {
    navigate(
        route = PhotoPicker,
        navOptions = navOptions,
    )
}

fun NavGraphBuilder.photoPickerNavGraph(
    paddingValues: PaddingValues,
) {
    composable<PhotoPicker> {
        PhotoPickerRoute(
            paddingValues = paddingValues
        )
    }
}