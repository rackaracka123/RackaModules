package net.rackaracka.io

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

@Composable
actual fun rememberIO(): IO = remember { IOIOS() }
