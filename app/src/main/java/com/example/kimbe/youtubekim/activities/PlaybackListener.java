package com.example.kimbe.youtubekim.activities;

import com.google.android.youtube.player.YouTubePlayer;

/**
 * Created by kimbe on 21/03/2018.
 */

public class PlaybackListener implements YouTubePlayer.PlaybackEventListener {

    @Override
    public void onBuffering(boolean isBuffering) {
        // Called when buffering starts or ends.

    }

    @Override
    public void onPaused() {
        // Called when playback is paused, either due to pause() or user action.

    }

    @Override
    public void onPlaying() {
        // Called when playback starts, either due to play() or user action.

    }

    @Override
    public void onSeekTo(int newPositionMillis) {
        // Called when a jump in playback position occurs,
        //either due to the user scrubbing or a seek method being called

    }

    @Override
    public void onStopped() {
        // Called when playback stops for a reason other than being paused.

    }
}
