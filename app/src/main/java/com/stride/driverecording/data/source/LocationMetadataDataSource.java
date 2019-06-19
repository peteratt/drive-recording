package com.stride.driverecording.data.source;

import android.os.Handler;
import android.os.Looper;

import com.stride.driverecording.data.models.LocationMetadata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

public class LocationMetadataDataSource {
    private static LocationMetadataDataSource instance;

    public static LocationMetadataDataSource getInstance() {
        if (instance == null) {
            instance = new LocationMetadataDataSource();
        }

        return instance;
    }

        private final Subject<LocationMetadata> locationMetadataSubject = PublishSubject.create();
    private final List<LocationMetadataDataSource.Listener> listeners = new ArrayList<>();
    private final Random random = new Random();

    private LocationMetadataDataSource() {}

    public void start() {
        final Handler handler = new Handler(Looper.getMainLooper());

        Runnable update = new Runnable() {
            @Override
            public void run() {
                long timestamp = new Date().getTime();
                double speed = random.nextDouble();
                float orientation = random.nextFloat();
                float deduction = random.nextFloat();
                LocationMetadata fix = new LocationMetadata(timestamp, speed, orientation, deduction, random.nextFloat());

                locationMetadataSubject.onNext(fix);

                for (LocationMetadataDataSource.Listener listener : listeners) {
                    listener.onNewLocationMetadata(fix);
                }
                handler.postDelayed(this, 1000);
            }
        };
        handler.post(update);
    }

    public void subscribeToUpdates(LocationMetadataDataSource.Listener listener) {
        listeners.add(listener);
    }

    public Observable<LocationMetadata> getLocationMetadata() {
        return locationMetadataSubject;
    }

    public interface Listener {
        void onNewLocationMetadata(LocationMetadata fix);
    }
}
