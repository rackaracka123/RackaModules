package net.rackaracka.io

data class FilePath(val path: String, val location: Location)

enum class Location {
    Documents
}
