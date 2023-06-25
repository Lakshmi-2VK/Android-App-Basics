package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    TextView t1;
    Button b1;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.edit);
        t1=findViewById(R.id.text);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                float a=(float)Integer.parseInt(e1.getText().toString());
                a= (float) (a/2.54);
                t1.setText("Your answer:"+String.valueOf(a));
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                float b=(float)Integer.parseInt(e1.getText().toString());
                b= (float) (b*2.54);
                t1.setText("Your answer:"+String.valueOf(b));
            }
        });

    }
}