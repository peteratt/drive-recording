package com.stride.driverecording.features.drive_recording;

import com.stride.driverecording.data.models.TripStatus;

public interface DriveRecordingView {
    void onTripStarted();
    void onTripStopped();
    void postTripStatus(TripStatus tripStatus);
}
