package com.swyp9.android.presentation.onboarding

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.swyp9.android.core.common.state.UiState

@Composable
fun OnboardingRoute(
    modifier: Modifier = Modifier,
    viewModel: OnboardingViewModel = hiltViewModel(),
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    OnboardingScreen(
        uiState = uiState,
        modifier = modifier,
    )
}

@Composable
fun OnboardingScreen(
    uiState: UiState<OnboardingState>,
    modifier: Modifier = Modifier,
) {
    // TODO: uiState 분기 처리(Loading / Empty / Error / Success) 및 실제 UI 구현
    Text(text = "첫 진입·서비스 소개", modifier = modifier.fillMaxSize())
}
