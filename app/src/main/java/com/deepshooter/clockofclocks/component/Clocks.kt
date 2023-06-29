package com.deepshooter.clockofclocks.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.deepshooter.clockofclocks.model.Clock
import com.deepshooter.clockofclocks.model.Eight
import com.deepshooter.clockofclocks.model.Five
import com.deepshooter.clockofclocks.model.Four
import com.deepshooter.clockofclocks.model.Nine
import com.deepshooter.clockofclocks.model.One
import com.deepshooter.clockofclocks.model.Seven
import com.deepshooter.clockofclocks.model.Six
import com.deepshooter.clockofclocks.model.Speed
import com.deepshooter.clockofclocks.model.Three
import com.deepshooter.clockofclocks.model.Two
import com.deepshooter.clockofclocks.model.Zero


private const val WIDTH = 4
private const val HEIGHT = 6

private val Spacing = Arrangement.spacedBy(4.dp)
private val Digits = arrayOf(Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine)


@Composable
fun Clocks(
    digit: Int,
    speed: Speed,
    modifier: Modifier = Modifier
) {
    Clocks(Digits[digit], speed, modifier)
}


@Composable
fun Clocks(
    clocks: Array<Clock>,
    speed: Speed,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier, verticalArrangement = Spacing) {
        for (row in 0 until HEIGHT) {
            Row(horizontalArrangement = Spacing) {
                for (col in 0 until WIDTH) {
                    Clock(
                        clock = clocks[row * WIDTH + col],
                        speed = speed,
                        modifier = Modifier
                            .weight(1f)
                            .aspectRatio(1f)
                    )
                }
            }
        }
    }
}


@Preview
@Composable
fun ClocksPreview() {
    Clocks(clocks = Eight, speed = Speed.NORMAL)
}
