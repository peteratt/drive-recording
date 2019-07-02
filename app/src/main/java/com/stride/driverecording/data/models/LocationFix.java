package com.stride.driverecording.data.models;

import java.util.Objects;

/**
 * A location fix is just a latitude and a longitude that represents the user's current location.
 */
public class LocationFix {
    /**
     * Timestamp for the location fix.
     */
    public final long timestamp;

    public final float lat;
    public final float lng;

    public LocationFix(long timestamp, float lat, float lng) {
        this.timestamp = timestamp;
        this.lat = lat;
        this.lng = lng;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocationFix that = (LocationFix) o;
        return timestamp == that.timestamp &&
                Float.compare(that.lat, lat) == 0 &&
                Float.compare(that.lng, lng) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, lat, lng);
    }

    @Override
    public String toString() {
        return "LocationFix{" +
                "timestamp=" + timestamp +
                ", lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
