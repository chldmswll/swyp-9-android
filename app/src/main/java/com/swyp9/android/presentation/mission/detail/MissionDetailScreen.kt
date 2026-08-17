package com.swyp9.android.presentation.mission.detail

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.swyp9.android.core.common.state.UiState

@Composable
fun MissionDetailRoute(
    modifier: Modifier = Modifier,
    viewModel: MissionDetailViewModel = hiltViewModel(),
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    MissionDetailScreen(
        uiState = uiState,
        modifier = modifier,
    )
}

@Composable
fun MissionDetailScreen(
    uiState: UiState<MissionDetailState>,
    modifier: Modifier = Modifier,
) {
    // TODO: uiState 분기 처리(Loading / Empty / Error / Success) 및 실제 UI 구현
    Text(text = "미션 상세", modifier = modifier.fillMaxSize())
}
