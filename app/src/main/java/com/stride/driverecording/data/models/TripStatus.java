package com.stride.driverecording.data.models;

import java.util.List;
import java.util.Objects;

/**
 * The status for the current trip. Used to render values on the screen.
 */
public class TripStatus {
    /**
     * Distance so far for a trip, in miles.
     */
    public final float distanceSoFar;

    /**
     * All the waypoints the user has been in so far inside the trip.
     */
    public final List<LocationFix> waypointsSoFar;

    public TripStatus(float distanceSoFar, List<LocationFix> waypointsSoFar) {
        this.distanceSoFar = distanceSoFar;
        this.waypointsSoFar = waypointsSoFar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TripStatus that = (TripStatus) o;
        return Float.compare(that.distanceSoFar, distanceSoFar) == 0 &&
                Objects.equals(waypointsSoFar, that.waypointsSoFar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(distanceSoFar, waypointsSoFar);
    }

    @Override
    public String toString() {
        return "TripStatus{" +
                "distanceSoFar=" + distanceSoFar +
                ", waypointsSoFar=" + waypointsSoFar +
                '}';
    }
}
