package net.rackaracka.io

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext

@Composable
actual fun rememberIO(): IO {
    val context = LocalContext.current
    return remember { IOAndroid(context.filesDir) }
}
