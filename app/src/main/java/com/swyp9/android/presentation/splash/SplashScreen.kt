package com.swyp9.android.presentation.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun SplashRoute(
    paddingValues: PaddingValues,
    navigateToMissionSelect: () -> Unit,
    navigateToOnboarding: () -> Unit,
//    viewModel: SplashViewModel = hiltViewModel(),
) {
//    LaunchedEffect(viewModel) {
//        viewModel.sideEffect.collect { sideEffect ->
//            when (sideEffect) {
//                SplashSideEffect.NavigateTonavigateToOnboarding ->
//                    navigateTonavigateToOnboarding()
//                SplashSideEffect.NavigateTonavigateToMissionSelect ->
//                    navigateTonavigateToMissionSelect()
//            }
//        }
//    }

    SplashScreen(
        paddingValues = paddingValues,
    )
}

@Composable
private fun SplashScreen(
    paddingValues: PaddingValues,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(paddingValues),
    ) {
    }
}