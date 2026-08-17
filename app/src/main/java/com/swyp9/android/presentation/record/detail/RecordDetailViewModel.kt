package com.swyp9.android.presentation.record.detail

import androidx.lifecycle.ViewModel
import com.swyp9.android.core.common.state.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class RecordDetailViewModel @Inject constructor(
    // TODO: Repository 등 의존성 주입
) : ViewModel() {

    private val _uiState = MutableStateFlow<UiState<RecordDetailState>>(UiState.Loading)
    val uiState: StateFlow<UiState<RecordDetailState>> = _uiState.asStateFlow()

    // TODO: 데이터 로드 로직 구현
}
