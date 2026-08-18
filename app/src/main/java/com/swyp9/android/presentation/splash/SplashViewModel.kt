//package com.swyp9.android.presentation.splash
//
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.swyp9.android.presentation.splash.state.SplashSideEffect
//import dagger.hilt.android.lifecycle.HiltViewModel
//import javax.inject.Inject
//import kotlinx.coroutines.delay
//import kotlinx.coroutines.flow.MutableSharedFlow
//import kotlinx.coroutines.flow.asSharedFlow
//import kotlinx.coroutines.launch
//import kotlin.time.Duration.Companion.milliseconds
//
//private const val SPLASH_DELAY_MILLIS = 1_500L
//
//@HiltViewModel
//class SplashViewModel @Inject constructor(
//    private val signInRepository: SignInRepository,
//) : ViewModel() {
//    private val _sideEffect = MutableSharedFlow<SplashSideEffect>()
//    val sideEffect = _sideEffect.asSharedFlow()
//
//    init {
//        checkStoredSession()
//    }
//
//    private fun checkStoredSession() {
//        viewModelScope.launch {
//            delay(SPLASH_DELAY_MILLIS.milliseconds)
//
//            val sideEffect = signInRepository.refreshSession().fold(
//                onSuccess = { SplashSideEffect.NavigateToMissionSelect },
//                onFailure = { SplashSideEffect.NavigateToSignIn },
//            )
//
//            _sideEffect.emit(sideEffect)
//        }
//    }
//}
