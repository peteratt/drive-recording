package com.stride.driverecording.features.drive_recording;

import com.stride.driverecording.data.source.LocationFixDataSource;
import com.stride.driverecording.data.source.LocationMetadataDataSource;

public class DriveRecordingPresenter {

    private final DriveRecordingView view;
    private final LocationFixDataSource locationFixDataSource;
    private final LocationMetadataDataSource locationMetadataDataSource;

    public DriveRecordingPresenter(DriveRecordingView view, LocationFixDataSource locationFixDataSource, LocationMetadataDataSource locationMetadataDataSource) {
        this.view = view;
        this.locationFixDataSource = locationFixDataSource;
        this.locationMetadataDataSource = locationMetadataDataSource;
    }

    public void toggleTrip() {
        // TODO toggle between start and stop. When a trip starts, we should call startTrip below. When it ends, we should call endTrip below.
    }

    private void startTrip() {
        // TODO subscribe to both data sources
        // TODO post trip statuses only when we have a new fix and metadata from both data sources.
    }

    private void stopTrip() {
        // TODO stop subscription
    }
}
