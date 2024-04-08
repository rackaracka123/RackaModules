package net.rackaracka.media.player

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import net.rackaracka.media.AspectRatio

@Composable
expect fun PlayerView(
    modifier: Modifier,
    player: Player,
    aspectRatio: AspectRatio,
    enableMediaControls: Boolean,
    releasePlayerOnDispose: Boolean
)
