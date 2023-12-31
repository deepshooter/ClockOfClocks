package com.deepshooter.clockofclocks.model

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import kotlin.math.PI


private const val RADIAN_PER_HOUR = PI / 6
private const val RADIAN_PER_MINUTE = PI / 30


@Stable
@Immutable
enum class Clock(hour: Int, minute: Int) {
    TOP_LEFT(3, 30),
    TOP_RIGHT(6, 45),
    BOTTOM_LEFT(0, 15),
    BOTTOM_RIGHT(0, 45),
    HORIZONTAL(3, 45),
    VERTICAL(0, 30),
    EMPTY(7, 35);

    val hourRadian = hour * RADIAN_PER_HOUR
    val minuteRadian = minute * RADIAN_PER_MINUTE
}

@Stable
@Immutable
enum class Speed(val duration: Int) {
    SLOW(3200),
    NORMAL(1600),
    FAST(800)
}
