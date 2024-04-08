package net.rackaracka.media.player

import net.rackaracka.io.FilePath

sealed class Track {
    data class File(val filePath: FilePath) : Track()
    data class Network(val url: String) : Track()
}
