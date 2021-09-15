package com.example.help;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView title1, title2;
    ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title1 =(TextView)findViewById(R.id.title1);
        title2 =(TextView)findViewById(R.id.title2);
        button =(ImageButton)findViewById(R.id.imageButton);
        MediaPlayer mp = MediaPlayer.create(getBaseContext(),R.raw.car);
        mp.start();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(getApplicationContext(),MainActivity2.class );
                startActivity(go);
                finish();
            }
        });


    }



}
