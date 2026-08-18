package com.swyp9.android.presentation.main.navigation

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.swyp9.android.presentation.mission.complete.navigation.missionCompleteNavGraph
import com.swyp9.android.presentation.mission.detail.navigation.missionDetailNavGraph
import com.swyp9.android.presentation.mission.photo.navigation.photoPickerNavGraph
import com.swyp9.android.presentation.mission.retrospective.navigation.retrospectiveNavGraph
import com.swyp9.android.presentation.mission.select.navigation.missionSelectNavGraph
import com.swyp9.android.presentation.onboarding.navigation.onboardingNavGraph
import com.swyp9.android.presentation.record.navigation.recordNavGraph
import com.swyp9.android.presentation.signin.navigation.signInNavGraph
import com.swyp9.android.presentation.splash.navigation.splashNavGraph

@Composable
fun SwypNavHost(
    appState: MainAppState,
    paddingValues: PaddingValues,
    modifier: Modifier = Modifier,
) {
    NavHost(
        enterTransition = { EnterTransition.None },
        exitTransition = { ExitTransition.None },
        popEnterTransition = { EnterTransition.None },
        popExitTransition = { ExitTransition.None },
        navController = appState.navController,
        startDestination = appState.startDestination,
        modifier = modifier,
    ) {
        missionSelectNavGraph(paddingValues = paddingValues)
        missionCompleteNavGraph(paddingValues = paddingValues)
        missionDetailNavGraph(paddingValues = paddingValues)
        photoPickerNavGraph(paddingValues = paddingValues)
        retrospectiveNavGraph(paddingValues = paddingValues)
        onboardingNavGraph(paddingValues = paddingValues)
        recordNavGraph(paddingValues = paddingValues)
        signInNavGraph(
            paddingValues = paddingValues,
        )
        splashNavGraph(
            paddingValues = paddingValues,
            navigateToMissionSelect = appState::navigateToMissionSelect,
            navigateToOnboarding = appState::navigateToOnboarding
        )
    }
}