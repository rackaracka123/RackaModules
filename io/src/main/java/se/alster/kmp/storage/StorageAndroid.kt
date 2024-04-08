package net.rackaracka.io

import java.io.File

class IOAndroid(private val baseStorage: File): IO {
    override suspend fun write(file: FilePath, data: ByteArray) {
        File(baseStorage, file.path).writeBytes(data)
    }

    override suspend fun read(file: FilePath): ByteArray {
        return File(baseStorage, file.path).readBytes()
    }

    override suspend fun delete(file: FilePath) : Boolean {
        return File(baseStorage, file.path).delete()
    }
}
