package net.rackaracka.media.player.extensions

import platform.AVFoundation.AVPlayerItem
import platform.Foundation.NSURL
import net.rackaracka.media.player.Track
import net.rackaracka.media.player.TrackList
import net.rackaracka.io.toNSURL

fun Track.toAVPlayerItem() =
    when (this) {
        is Track.File -> AVPlayerItem(filePath.toNSURL())
        is Track.Network -> AVPlayerItem(NSURL.URLWithString(this.url)!!)
    }

fun TrackList.toAVPlayerItems() = tracks.map { it.toAVPlayerItem() }
