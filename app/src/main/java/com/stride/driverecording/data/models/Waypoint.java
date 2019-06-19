package com.stride.driverecording.data.models;

import java.util.Objects;

public class Waypoint {
    public final LocationFix fix;
    public final LocationMetadata metadata;

    public Waypoint(LocationFix fix, LocationMetadata metadata) {
        this.fix = fix;
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Waypoint waypoint = (Waypoint) o;
        return Objects.equals(fix, waypoint.fix) &&
                Objects.equals(metadata, waypoint.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fix, metadata);
    }

    @Override
    public String toString() {
        return "Waypoint{" +
                "fix=" + fix +
                ", metadata=" + metadata +
                '}';
    }
}
