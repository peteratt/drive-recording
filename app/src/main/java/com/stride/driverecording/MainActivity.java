package com.stride.driverecording;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.stride.driverecording.data.models.TripStatus;
import com.stride.driverecording.data.source.LocationFixDataSource;
import com.stride.driverecording.data.source.LocationMetadataDataSource;
import com.stride.driverecording.features.drive_recording.DriveRecordingPresenter;
import com.stride.driverecording.features.drive_recording.DriveRecordingView;

public class MainActivity extends AppCompatActivity implements DriveRecordingView {

    private DriveRecordingPresenter presenter;

    private Button button;
    private TextView deductionAmountView;
    private TextView timeValueView;
    private TextView distanceValueView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LocationFixDataSource.getInstance().start();
        LocationMetadataDataSource.getInstance().start();

        presenter = new DriveRecordingPresenter(
                this,
                LocationFixDataSource.getInstance(),
                LocationMetadataDataSource.getInstance()
        );

        button = findViewById(R.id.trip_button);
        deductionAmountView = findViewById(R.id.deduction_amount);
        timeValueView = findViewById(R.id.time_value);
        distanceValueView = findViewById(R.id.distance_value);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.toggleTrip();
            }
        });
    }

    @Override
    public void onTripStarted() {
        button.setText("I'm done driving");
    }

    @Override
    public void onTripStopped() {
        button.setText("Start Trip");
    }

    @Override
    public void postTripStatus(TripStatus tripStatus) {
        // TODO render the trip status on the screen
    }
}
