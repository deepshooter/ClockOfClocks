package com.deepshooter.clockofclocks.ui.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.deepshooter.clockofclocks.component.Clocks
import com.deepshooter.clockofclocks.model.Separator
import com.deepshooter.clockofclocks.model.Speed
import com.deepshooter.clockofclocks.ui.theme.ClockOfClocksTheme
import com.deepshooter.clockofclocks.ui.theme.clockBackground
import kotlinx.coroutines.delay
import java.time.LocalDateTime

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClockOfClocksTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.clockBackground
                ) {
                    ClockOfClocks(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = 24.dp, vertical = 16.dp)
                    )
                }
            }
        }
    }
}


@Composable
fun ClockOfClocks(modifier: Modifier = Modifier) {

    Box(modifier = modifier, contentAlignment = Alignment.Center) {

        var now by remember { mutableStateOf(LocalDateTime.now()) }

        LaunchedEffect(Unit) {
            while (true) {
                delay(1000L)
                now = LocalDateTime.now()
            }
        }

        Row {

            //Hours
            Clocks(
                digit = now.hour / 10,
                speed = Speed.SLOW,
                modifier = Modifier.weight(1f)
            )
            Clocks(
                digit = now.hour % 10,
                speed = Speed.SLOW,
                modifier = Modifier.weight(1f)
            )

            //Separator
            Clocks(
                clocks = Separator,
                speed = Speed.FAST,
                modifier = Modifier.weight(1f)
            )

            //Minutes
            Clocks(
                digit = now.minute / 10,
                speed = Speed.NORMAL,
                modifier = Modifier.weight(1f)
            )
            Clocks(
                digit = now.minute % 10,
                speed = Speed.NORMAL,
                modifier = Modifier.weight(1f)
            )

            //Separator
            Clocks(
                clocks = Separator,
                speed = Speed.FAST,
                modifier = Modifier.weight(1f)
            )

            //Seconds
            Clocks(
                digit = now.second / 10,
                speed = Speed.FAST,
                modifier = Modifier.weight(1f)
            )
            Clocks(
                digit = now.second % 10,
                speed = Speed.FAST,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Preview
@Composable
fun ClockOfClocksPreview() {
    ClockOfClocks()
}
