package com.stride.driverecording.data.models;

import java.util.Objects;

public class LocationMetadata {
    public final long timestamp;
    public final double speed;
    public final float orientation;
    public final float deductionForWaypoint;
    public final float distanceTraveled;

    public LocationMetadata(long timestamp, double speed, float orientation, float deductionForWaypoint, float distanceTraveled) {
        this.timestamp = timestamp;
        this.speed = speed;
        this.orientation = orientation;
        this.deductionForWaypoint = deductionForWaypoint;
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
                Float.compare(that.deductionForWaypoint, deductionForWaypoint) == 0 &&
                Float.compare(that.distanceTraveled, distanceTraveled) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, speed, orientation, deductionForWaypoint, distanceTraveled);
    }

    @Override
    public String toString() {
        return "LocationMetadata{" +
                "timestamp=" + timestamp +
                ", speed=" + speed +
                ", orientation=" + orientation +
                ", deductionForWaypoint=" + deductionForWaypoint +
                ", distanceTraveled=" + distanceTraveled +
                '}';
    }
}
