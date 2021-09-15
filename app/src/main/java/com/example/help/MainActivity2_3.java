package com.example.help;

import android.content.Intent;
import android.os.Bundle;
import  androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Calendar;

public class MainActivity2_3 extends AppCompatActivity {
    String data, year, month, date;
    EditText weight;
    CalendarView cal;
    ImageButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_3);
        cal =(CalendarView)findViewById(R.id.calendarView);
        weight =(EditText)findViewById(R.id.weight);
        button=(ImageButton)findViewById(R.id.weight2);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data =weight.getText().toString();
                Calendar Date = Calendar.getInstance();
                Date.setTimeInMillis(cal.getDate());
                year =Integer.toString(Date.get(Calendar.YEAR));
                month =Integer.toString(1+Date.get(Calendar.MONTH));
                date =Integer.toString(Date.get(Calendar.DATE));

                Intent go = new Intent(getApplicationContext(),MainActivity3.class);
                go.putExtra("YEAR",year);
                go.putExtra("MO",month);
                go.putExtra("DA",date);
                go.putExtra("DATA",data);
                startActivityForResult(go,0);

            }
        });


    }

}
