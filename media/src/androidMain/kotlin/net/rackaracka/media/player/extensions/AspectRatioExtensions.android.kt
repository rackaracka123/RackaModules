package net.rackaracka.media.player.extensions

import androidx.media3.common.util.UnstableApi
import androidx.media3.ui.AspectRatioFrameLayout
import net.rackaracka.media.AspectRatio

@UnstableApi
fun AspectRatio.toResizeMode() = when (this) {
    AspectRatio.FitWithAspectRatio -> AspectRatioFrameLayout.RESIZE_MODE_FIT
    AspectRatio.ScaleToFit -> AspectRatioFrameLayout.RESIZE_MODE_ZOOM
    AspectRatio.ScaleToFitWithCropping -> AspectRatioFrameLayout.RESIZE_MODE_FILL
}
