package com.example.help;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

        ImageButton push,guide,weight,exit,mp3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        push=(ImageButton)findViewById(R.id.push);
        guide=(ImageButton)findViewById(R.id.guide);
        weight=(ImageButton)findViewById(R.id.weight);
        exit=(ImageButton)findViewById(R.id.exit);
        mp3=(ImageButton)findViewById(R.id.music);

        push.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent go1 = new Intent(getApplicationContext(),MainActivity2_1.class );
                Toast.makeText(getApplicationContext(),"팔굽혀 펴기!",Toast.LENGTH_SHORT ).show();
                startActivity(go1);
            }
        });
        guide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent go2 = new Intent(getApplicationContext(), com.example.help.MainActivity2_2.class );
                Toast.makeText(getApplicationContext(),"맨몸 운동!",Toast.LENGTH_SHORT).show();
                startActivity(go2);
            }
        });
        weight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent go3 = new Intent(getApplicationContext(), com.example.help.MainActivity2_3.class );
                Toast.makeText(getApplicationContext(),"체중 관리!",Toast.LENGTH_SHORT).show();
                startActivity(go3);
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"나가기",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
        mp3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent go4 =new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.melon.com/"));
                Toast.makeText(getApplicationContext(),"멜론에서 음악을 찾아듣자!",Toast.LENGTH_SHORT ).show();
                startActivity(go4);
            }
        });

    }

}
