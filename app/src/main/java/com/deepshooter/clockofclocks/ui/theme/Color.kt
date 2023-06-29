package com.deepshooter.clockofclocks.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val Teal500 = Color(0xFF009688)
val Purple700 = Color(0xFF673AB7)



val ColorScheme.clockBackground: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color.Black else Color.White


val ColorScheme.handColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Purple700 else Teal500
