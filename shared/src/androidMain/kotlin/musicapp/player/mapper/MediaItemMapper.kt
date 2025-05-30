package musicapp.player.mapper

import android.net.Uri
import androidx.media3.common.MediaItem
import androidx.media3.common.MediaMetadata


fun musicapp.player.MediaItem.toMediaItem(): MediaItem {
    val metadata = MediaMetadata.Builder()
        .setTitle(title)
        .setArtist(artist)
        .setArtworkUri(Uri.parse(artworkUrl))
        .build()

    return MediaItem.Builder()
        .setMediaId(pathSource)
        .setUri(pathSource)
        .setMediaMetadata(metadata)
        .build()
}