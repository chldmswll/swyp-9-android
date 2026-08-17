package com.swyp9.android.presentation.mission.complete

import androidx.lifecycle.ViewModel
import com.swyp9.android.core.common.state.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MissionCompleteViewModel @Inject constructor(
    // TODO: Repository 등 의존성 주입
) : ViewModel() {

    private val _uiState = MutableStateFlow<UiState<MissionCompleteState>>(UiState.Loading)
    val uiState: StateFlow<UiState<MissionCompleteState>> = _uiState.asStateFlow()

    // TODO: 데이터 로드 로직 구현
}
