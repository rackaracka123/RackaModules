package net.rackaracka

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay
import net.rackaracka.media.AspectRatio
import net.rackaracka.media.player.PlayerView
import net.rackaracka.media.player.Track
import net.rackaracka.media.player.rememberPlayer

@Composable
fun VideoPlayerExample() {
    val player = rememberPlayer()

    Column {
        PlayerView(
            modifier = Modifier.fillMaxSize(),
            player = player,
            aspectRatio = AspectRatio.FitWithAspectRatio,
            enableMediaControls = true,
            releasePlayerOnDispose = true
        )
    }
    LaunchedEffect(Unit) {
        player.prepareTrackForPlayback(
            Track.Network("https://storage.googleapis.com/gtv-videos-bucket/sample/ForBiggerFun.mp4")
        )
        player.setPlayOnReady(true)
        delay(2000)
    }
}
