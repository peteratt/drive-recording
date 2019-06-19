package com.stride.driverecording.data.source;

import android.os.Handler;
import android.os.Looper;

import com.stride.driverecording.data.models.LocationFix;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

public class LocationFixDataSource {

    private static LocationFixDataSource instance;

    public static LocationFixDataSource getInstance() {
        if (instance == null) {
            instance = new LocationFixDataSource();
        }

        return instance;
    }

    private final Subject<LocationFix> locationFixSubject = PublishSubject.create();
    private final List<Listener> listeners = new ArrayList<>();
    private final Random random = new Random();

    private LocationFixDataSource() {}

    public void start() {
        final Handler handler = new Handler(Looper.getMainLooper());

        Runnable update = new Runnable() {
            @Override
            public void run() {
                float lat = random.nextFloat();
                float lng = random.nextFloat();
                LocationFix fix = new LocationFix(lat, lng);

                locationFixSubject.onNext(fix);

                for (Listener listener : listeners) {
                    listener.onNewLocationFix(fix);
                }
                handler.postDelayed(this, 1000);
            }
        };
        handler.post(update);
    }

    public void subscribeToUpdates(Listener listener) {
        listeners.add(listener);
    }

    public Observable<LocationFix> getLocationFixes() {
        return locationFixSubject;
    }

    public interface Listener {
        void onNewLocationFix(LocationFix fix);
    }
}
