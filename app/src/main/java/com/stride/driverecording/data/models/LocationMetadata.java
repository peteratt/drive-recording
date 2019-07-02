package com.stride.driverecording.data.models;

import java.util.Objects;

/**
 * Metadata for every location fix.
 */
public class LocationMetadata {
    /**
     * Timestamp for the location fix.
     */
    public final long timestamp;

    /**
     * Distance traveled since the last location fix, in miles. For example, if since the last location
     * update (a second ago) the user has traveled 0.03 miles, distanceTraveled will be 0.03.
     */
    public final float distanceTraveled;

    public LocationMetadata(long timestamp, float distanceTraveled) {
        this.timestamp = timestamp;
        this.distanceTraveled = distanceTraveled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocationMetadata that = (LocationMetadata) o;
        return timestamp == that.timestamp &&
                Float.compare(that.distanceTraveled, distanceTraveled) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, distanceTraveled);
    }

    @Override
    public String toString() {
        return "LocationMetadata{" +
                "timestamp=" + timestamp +
                ", distanceTraveled=" + distanceTraveled +
                '}';
    }
}
