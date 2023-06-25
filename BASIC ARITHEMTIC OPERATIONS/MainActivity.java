package com.example.lab_3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    EditText e2;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.edit1);
        e2= findViewById(R.id.edit2);
        b1= findViewById(R.id.button1);
        b2= findViewById(R.id.button2);
        b3= findViewById(R.id.button3);
        b4= findViewById(R.id.button4);
        b5= findViewById(R.id.button5);
        t1= findViewById(R.id.text);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                float a=(float)Integer.parseInt(e1.getText().toString());
                float b=(float)Integer.parseInt(e2.getText().toString());
                float c= a+b;
                t1.setText("Your answer:"+String.valueOf(c));
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                float a=(float)Integer.parseInt(e1.getText().toString());
                float b=(float)Integer.parseInt(e2.getText().toString());
                float c= a-b;
                t1.setText("Your answer:"+String.valueOf(c));
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                float a=(float)Integer.parseInt(e1.getText().toString());
                float b=(float)Integer.parseInt(e2.getText().toString());
                float c= a*b;
                t1.setText("Your answer:"+String.valueOf(c));
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                float a=(float)Integer.parseInt(e1.getText().toString());
                float b=(float)Integer.parseInt(e2.getText().toString());
                float c= a/b;
                t1.setText("Your answer:"+String.valueOf(c));
            }
        });
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                float a=(float)Integer.parseInt(e1.getText().toString());
                float b=(float)Integer.parseInt(e2.getText().toString());
                float c= a%b;
                t1.setText("Your answer:"+String.valueOf(c));
            }
        });

    }
}