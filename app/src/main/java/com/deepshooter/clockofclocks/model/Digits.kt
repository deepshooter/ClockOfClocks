package com.deepshooter.clockofclocks.model

import com.deepshooter.clockofclocks.model.Clock.TOP_LEFT
import com.deepshooter.clockofclocks.model.Clock.HORIZONTAL
import com.deepshooter.clockofclocks.model.Clock.TOP_RIGHT
import com.deepshooter.clockofclocks.model.Clock.VERTICAL
import com.deepshooter.clockofclocks.model.Clock.BOTTOM_LEFT
import com.deepshooter.clockofclocks.model.Clock.BOTTOM_RIGHT
import com.deepshooter.clockofclocks.model.Clock.EMPTY


val Zero = arrayOf(
    TOP_LEFT, HORIZONTAL, HORIZONTAL, TOP_RIGHT,
    VERTICAL, TOP_LEFT, TOP_RIGHT, VERTICAL,
    VERTICAL, VERTICAL, VERTICAL, VERTICAL,
    VERTICAL, VERTICAL, VERTICAL, VERTICAL,
    VERTICAL, BOTTOM_LEFT, BOTTOM_RIGHT, VERTICAL,
    BOTTOM_LEFT, HORIZONTAL, HORIZONTAL, BOTTOM_RIGHT
)

val One = arrayOf(
    EMPTY, TOP_LEFT, TOP_RIGHT, EMPTY,
    EMPTY, VERTICAL, VERTICAL, EMPTY,
    EMPTY, VERTICAL, VERTICAL, EMPTY,
    EMPTY, VERTICAL, VERTICAL, EMPTY,
    EMPTY, VERTICAL, VERTICAL, EMPTY,
    EMPTY, BOTTOM_LEFT, BOTTOM_RIGHT, EMPTY,
)

val Two = arrayOf(
    TOP_LEFT, HORIZONTAL, HORIZONTAL, TOP_RIGHT,
    BOTTOM_LEFT, HORIZONTAL, TOP_RIGHT, VERTICAL,
    TOP_LEFT, HORIZONTAL, BOTTOM_RIGHT, VERTICAL,
    VERTICAL, TOP_LEFT, HORIZONTAL, BOTTOM_RIGHT,
    VERTICAL, BOTTOM_LEFT, HORIZONTAL, TOP_RIGHT,
    BOTTOM_LEFT, HORIZONTAL, HORIZONTAL, BOTTOM_RIGHT
)

val Three = arrayOf(
    TOP_LEFT, HORIZONTAL, HORIZONTAL, TOP_RIGHT,
    BOTTOM_LEFT, HORIZONTAL, TOP_RIGHT, VERTICAL,
    TOP_LEFT, HORIZONTAL, BOTTOM_RIGHT, VERTICAL,
    BOTTOM_LEFT, HORIZONTAL, TOP_RIGHT, VERTICAL,
    TOP_LEFT, HORIZONTAL, BOTTOM_RIGHT, VERTICAL,
    BOTTOM_LEFT, HORIZONTAL, HORIZONTAL, BOTTOM_RIGHT
)

val Four = arrayOf(
    TOP_LEFT, TOP_RIGHT, TOP_LEFT, TOP_RIGHT,
    VERTICAL, VERTICAL, VERTICAL, VERTICAL,
    VERTICAL, BOTTOM_LEFT, BOTTOM_RIGHT, VERTICAL,
    BOTTOM_LEFT, HORIZONTAL, TOP_RIGHT, VERTICAL,
    EMPTY, EMPTY, VERTICAL, VERTICAL,
    EMPTY, EMPTY, BOTTOM_LEFT, BOTTOM_RIGHT
)

val Five = arrayOf(
    TOP_LEFT, HORIZONTAL, HORIZONTAL, TOP_RIGHT,
    VERTICAL, TOP_LEFT, HORIZONTAL, BOTTOM_RIGHT,
    VERTICAL, BOTTOM_LEFT, HORIZONTAL, TOP_RIGHT,
    BOTTOM_LEFT, HORIZONTAL, TOP_RIGHT, VERTICAL,
    TOP_LEFT, HORIZONTAL, BOTTOM_RIGHT, VERTICAL,
    BOTTOM_LEFT, HORIZONTAL, HORIZONTAL, BOTTOM_RIGHT
)

val Six = arrayOf(
    TOP_LEFT, HORIZONTAL, HORIZONTAL, TOP_RIGHT,
    VERTICAL, TOP_LEFT, HORIZONTAL, BOTTOM_RIGHT,
    VERTICAL, BOTTOM_LEFT, HORIZONTAL, TOP_RIGHT,
    VERTICAL, TOP_LEFT, TOP_RIGHT, VERTICAL,
    VERTICAL, BOTTOM_LEFT, BOTTOM_RIGHT, VERTICAL,
    BOTTOM_LEFT, HORIZONTAL, HORIZONTAL, BOTTOM_RIGHT
)

val Seven = arrayOf(
    TOP_LEFT, HORIZONTAL, HORIZONTAL, TOP_RIGHT,
    BOTTOM_LEFT, HORIZONTAL, TOP_RIGHT, VERTICAL,
    EMPTY, EMPTY, VERTICAL, VERTICAL,
    EMPTY, EMPTY, VERTICAL, VERTICAL,
    EMPTY, EMPTY, VERTICAL, VERTICAL,
    EMPTY, EMPTY, BOTTOM_LEFT, BOTTOM_RIGHT
)

val Eight = arrayOf(
    TOP_LEFT, HORIZONTAL, HORIZONTAL, TOP_RIGHT,
    VERTICAL, TOP_LEFT, TOP_RIGHT, VERTICAL,
    VERTICAL, BOTTOM_LEFT, BOTTOM_RIGHT, VERTICAL,
    VERTICAL, TOP_LEFT, TOP_RIGHT, VERTICAL,
    VERTICAL, BOTTOM_LEFT, BOTTOM_RIGHT, VERTICAL,
    BOTTOM_LEFT, HORIZONTAL, HORIZONTAL, BOTTOM_RIGHT
)

val Nine = arrayOf(
    TOP_LEFT, HORIZONTAL, HORIZONTAL, TOP_RIGHT,
    VERTICAL, TOP_LEFT, TOP_RIGHT, VERTICAL,
    VERTICAL, BOTTOM_LEFT, BOTTOM_RIGHT, VERTICAL,
    BOTTOM_LEFT, HORIZONTAL, TOP_RIGHT, VERTICAL,
    TOP_LEFT, HORIZONTAL, BOTTOM_RIGHT, VERTICAL,
    BOTTOM_LEFT, HORIZONTAL, HORIZONTAL, BOTTOM_RIGHT
)

val Separator = arrayOf(
    EMPTY, EMPTY, EMPTY, EMPTY,
    EMPTY, TOP_LEFT, TOP_RIGHT, EMPTY,
    EMPTY, BOTTOM_LEFT, BOTTOM_RIGHT, EMPTY,
    EMPTY, TOP_LEFT, TOP_RIGHT, EMPTY,
    EMPTY, BOTTOM_LEFT, BOTTOM_RIGHT, EMPTY,
    EMPTY, EMPTY, EMPTY, EMPTY
)
