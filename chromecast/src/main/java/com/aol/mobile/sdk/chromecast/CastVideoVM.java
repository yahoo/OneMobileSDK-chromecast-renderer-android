package com.aol.mobile.sdk.chromecast;

import android.support.annotation.Nullable;

public class CastVideoVM {
    @Nullable
    public String videoUrl;
    @Nullable
    public String title;
    @Nullable
    public Long seekPosition;
    @Nullable
    public Long currentPosition;
    public boolean isMuted;
    public boolean shouldPlay;
    public boolean isLive;
    public boolean isActive;
    @Nullable
    public Callbacks callbacks;

    public interface Callbacks {

        /**
         * Fired when duration of video is set.
         *
         * @param duration time in milliseconds, may be 0 if duration is not defined (live stream)
         */
        void onDurationReceived(long duration);

        /**
         * Fired when new position of playback reached
         *
         * @param position time in milliseconds
         */
        void onVideoPositionUpdated(long position);

        /**
         * Fired when actual playback flag is changed
         *
         * @param isActuallyPlaying <b>true</b> if video is actually playing, <b>false</b> otherwise
         */
        void onVideoPlaybackFlagUpdated(boolean isActuallyPlaying);

        /**
         * Fired when video reached its end
         */
        void onVideoEnded();

        /**
         * Fired when seek if performed.
         */
        void onSeekPerformed();
    }
}