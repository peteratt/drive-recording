package com.stride.driverecording.data.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Trip {
    public final List<Waypoint> waypoints;

    public Trip() {
        this.waypoints = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trip trip = (Trip) o;
        return waypoints.equals(trip.waypoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(waypoints);
    }

    @Override
    public String toString() {
        return "Trip{" +
                "waypoints=" + waypoints +
                '}';
    }
}
