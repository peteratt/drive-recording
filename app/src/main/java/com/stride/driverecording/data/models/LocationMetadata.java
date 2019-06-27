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
     * Speed for the location fix.
     */
    public final double speed;

    /**
     * Orientation for the location fix, in degrees.
     */
    public final float orientation;

    /**
     * Distance traveled since the last location fix.
     */
    public final float distanceTraveled;

    public LocationMetadata(long timestamp, double speed, float orientation, float distanceTraveled) {
        this.timestamp = timestamp;
        this.speed = speed;
        this.orientation = orientation;
        this.distanceTraveled = distanceTraveled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocationMetadata that = (LocationMetadata) o;
        return timestamp == that.timestamp &&
                Double.compare(that.speed, speed) == 0 &&
                Float.compare(that.orientation, orientation) == 0 &&
                Float.compare(that.distanceTraveled, distanceTraveled) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, speed, orientation, distanceTraveled);
    }

    @Override
    public String toString() {
        return "LocationMetadata{" +
                "timestamp=" + timestamp +
                ", speed=" + speed +
                ", orientation=" + orientation +
                ", distanceTraveled=" + distanceTraveled +
                '}';
    }
}
