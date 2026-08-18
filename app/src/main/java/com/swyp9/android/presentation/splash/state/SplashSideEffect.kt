package com.swyp9.android.presentation.splash.state

sealed interface SplashSideEffect {
    data object NavigateToMissionSelect : SplashSideEffect
    data object NavigateToOnboarding : SplashSideEffect
}
