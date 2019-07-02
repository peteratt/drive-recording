package com.stride.driverecording.features.drive_recording;

import com.stride.driverecording.data.models.TripStatus;

/**
 * Interface to the drive recording screen.
 */
public interface DriveRecordingView {
    /**
     * This should get called to notify the UI that a trip has started.
     */
    void onTripStarted();

    /**
     * This should get called to notify the UI that a trip has stopped.
     */
    void onTripStopped();

    /**
     * Renders the trip status on the screen.
     *
     * @param tripStatus the current trip status.
     */
    void postTripStatus(TripStatus tripStatus);
}
