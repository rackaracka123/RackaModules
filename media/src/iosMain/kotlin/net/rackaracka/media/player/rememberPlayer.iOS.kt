package net.rackaracka.media.player

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

@Composable
actual fun rememberPlayer(): Player = remember { PlayerIOS() }
