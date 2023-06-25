package com.example.timeanddate;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    DatePicker d;
    TextView t1,t2;
    TimePicker t;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        d=findViewById(R.id.date);
        t1=findViewById(R.id.text1);
        t2=findViewById(R.id.text2);
        t=findViewById(R.id.time);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            d.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
                @Override
                public void onDateChanged(DatePicker view, int i, int i1, int i2) {
                    String a=String.valueOf(i)+"/"+String.valueOf(i1+1)+"/"+String.valueOf(i2);
                    t1.setText(a);
                }
            });
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            t.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
                @Override
                public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                    String a=String.valueOf(i)+":"+String.valueOf(i1);
                    t2.setText(a);
                }
            });

        }
    }
}