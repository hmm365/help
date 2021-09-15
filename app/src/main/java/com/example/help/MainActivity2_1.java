package com.example.help;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.SystemClock;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity2_1 extends AppCompatActivity implements SensorEventListener {

    private SensorManager sm;
    private Sensor ss;
    TextView textView;
    Chronometer chr;
    ImageButton btn1, btn2, btn3;
    Button button;
    int index = 0, count = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_1);

        sm = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        ss = sm.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        textView = (TextView) findViewById(R.id.count);
        chr = (Chronometer) findViewById(R.id.chronometer);
        btn1 = (ImageButton) findViewById(R.id.button1);
        btn2 = (ImageButton) findViewById(R.id.button2);
        btn3 = (ImageButton) findViewById(R.id.button3);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = 0;
                textView.setText(" " + index);
            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                count++;
                if (count == 1) {
                    chr.setBase(SystemClock.elapsedRealtime());
                }
                chr.start();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chr.stop();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chr.setBase(SystemClock.elapsedRealtime());
            }
        });
    }

    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    protected void onResume() {
        super.onResume();
        sm.registerListener(this, ss, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        index++;
        textView.setText(" " + index / 2);
    }
}
