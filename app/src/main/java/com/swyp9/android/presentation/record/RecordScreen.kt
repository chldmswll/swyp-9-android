package com.swyp9.android.presentation.record

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.swyp9.android.core.common.state.UiState

@Composable
fun RecordRoute(
    paddingValues: PaddingValues,
    modifier: Modifier = Modifier,
    viewModel: RecordViewModel = hiltViewModel(),
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    RecordScreen(
        paddingValues = paddingValues,
        uiState = uiState,
        modifier = modifier,
    )
}

@Composable
fun RecordScreen(
    paddingValues: PaddingValues,
    uiState: UiState<RecordState>,
    modifier: Modifier = Modifier,
) {
    // TODO: uiState 분기 처리(Loading / Empty / Error / Success) 및 실제 UI 구현
    Text(
        text = "기록 목록",
        modifier = modifier
            .fillMaxSize()
            .padding(paddingValues),
    )
}
