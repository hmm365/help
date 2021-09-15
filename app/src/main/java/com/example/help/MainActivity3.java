package com.example.help;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    String year, month, date, data;
    TextView texty,textm,textd,textw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        texty =(TextView)findViewById(R.id.texty);
        textm =(TextView)findViewById(R.id.textm);
        textd =(TextView)findViewById(R.id.textd);
        textw =(TextView)findViewById(R.id.textw);


        Intent go=getIntent();
        year =go.getStringExtra("YEAR");
        month =go.getStringExtra("MO");
        date =go.getStringExtra("DA");
        data =go.getStringExtra("DATA");

        texty.setText(" "+year);
        textm.setText(" "+month);
        textd.setText(" "+date);
        textw.setText(" "+data);
        setResult(0);


    }

}
