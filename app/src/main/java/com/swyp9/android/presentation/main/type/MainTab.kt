package com.swyp9.android.presentation.main.type

import com.swyp9.android.core.common.navigation.MainTabRoute
import com.swyp9.android.presentation.mission.select.navigation.MissionSelect
import com.swyp9.android.presentation.record.navigation.Record
import kotlin.reflect.KClass

enum class MainTab(
    val label: String,
    val route: KClass<out MainTabRoute>,
) {
    MISSION(
        label = "미션",
        route = MissionSelect::class,
    ),

    RECORD(
        label = "기록",
        route = Record::class,
    ),
    ;

    companion object {
        fun find(predicate: (KClass<out MainTabRoute>) -> Boolean): MainTab? =
            entries.find { predicate(it.route) }
    }
}