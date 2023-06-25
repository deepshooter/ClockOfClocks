package com.deepshooter.clockofclocks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.deepshooter.clockofclocks.ui.theme.ClockOfClocksTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClockOfClocksTheme {

            }
        }
    }
}
