package com.swyp9.android.core.common.state

/**
 * 화면 단위 공통 UI 상태 컨트랙트.
 * 각 feature의 ViewModel은 이 타입으로 상태를 노출하고,
 * Screen composable은 when 분기로 core/designsystem의 공통 상태 컴포넌트
 * (LoadingView, EmptyView, ErrorView 등)를 활용해 렌더링한다.
 */
sealed interface UiState<out T> {
    data object Loading : UiState<Nothing>
    data object Empty : UiState<Nothing>
    data class Success<T>(val data: T) : UiState<T>
    data class Error(val message: String? = null) : UiState<Nothing>
}
