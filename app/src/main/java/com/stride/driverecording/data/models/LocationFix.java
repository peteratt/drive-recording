package com.stride.driverecording.data.models;

import java.util.Objects;

public class LocationFix {
    public final float lat;
    public final float lng;

    public LocationFix(float lat, float lng) {
        this.lat = lat;
        this.lng = lng;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocationFix that = (LocationFix) o;
        return Float.compare(that.lat, lat) == 0 &&
                Float.compare(that.lng, lng) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lat, lng);
    }

    @Override
    public String toString() {
        return "LocationFix{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
