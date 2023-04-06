package com.sebastian.marketar.helpers

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration

@Composable
fun ScreenHeightDp() : Int {
    val configuration = LocalConfiguration.current
    return configuration.screenHeightDp
}