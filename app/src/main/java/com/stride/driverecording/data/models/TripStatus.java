package com.stride.driverecording.data.models;

import java.util.Objects;

public class TripStatus {
    public final float deductionSoFar;
    public final float distanceSoFar;
    public final int timeElapsed;

    public TripStatus(float deductionSoFar, float distanceSoFar, int timeElapsed) {
        this.deductionSoFar = deductionSoFar;
        this.distanceSoFar = distanceSoFar;
        this.timeElapsed = timeElapsed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TripStatus that = (TripStatus) o;
        return Float.compare(that.deductionSoFar, deductionSoFar) == 0 &&
                Float.compare(that.distanceSoFar, distanceSoFar) == 0 &&
                timeElapsed == that.timeElapsed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(deductionSoFar, distanceSoFar, timeElapsed);
    }

    @Override
    public String toString() {
        return "TripStatus{" +
                "deductionSoFar=" + deductionSoFar +
                ", distanceSoFar=" + distanceSoFar +
                ", timeElapsed=" + timeElapsed +
                '}';
    }
}
