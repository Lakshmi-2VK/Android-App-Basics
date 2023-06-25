package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb;
    TextView txt;
    Button btn;
    CheckBox chk1;
    CheckBox chk2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg=findViewById(R.id.radiogroup);
        txt=findViewById(R.id.textView);
        btn=findViewById(R.id.button);
        chk1=findViewById(R.id.checkBox1);
        chk2=findViewById(R.id.checkBox2);
        if(chk1.isChecked() && !(chk2.isChecked())){
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int radio = rg.getCheckedRadioButtonId();
                    rb = findViewById(radio);
                    String outputText = "";

                    if (rb == findViewById(R.id.radioButton1)) {
                        outputText = "You are the KINGG";
                    } else if (rb == findViewById(R.id.radioButton2)) {
                        outputText = "SRSLY step up";
                    } else if (rb == findViewById(R.id.radioButton3)) {
                        outputText = "GOOD GOOOD";
                    } else if (rb == findViewById(R.id.radioButton4)) {
                        outputText = "Master arrived";
                    } else {
                        outputText = "Useless";
                    }
                    txt.setText(outputText);
                }

            });
        }
        else if(!(chk1.isChecked()) && chk2.isChecked()){
            rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    int radio = rg.getCheckedRadioButtonId();
                    rb = findViewById(radio);
                    String outputText = "";
                    if (rb == findViewById(R.id.radioButton1)) {
                        outputText = "You are the KINGG";
                    } else if (rb == findViewById(R.id.radioButton2)) {
                        outputText = "SRSLY step up";
                    } else if (rb == findViewById(R.id.radioButton3)) {
                        outputText = "GOOD GOOOD";
                    } else if (rb == findViewById(R.id.radioButton4)) {
                        outputText = "Master arrived";
                    } else {
                        outputText = "Useless";
                    }
                    Toast.makeText(MainActivity.this, outputText, Toast.LENGTH_SHORT).show();;
                }
            });
        }

        else{
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int radio = rg.getCheckedRadioButtonId();
                    rb = findViewById(radio);
                    String outputText = "";

                    if (rb == findViewById(R.id.radioButton1)) {
                        outputText = "You are the KINGG";
                    } else if (rb == findViewById(R.id.radioButton2)) {
                        outputText = "SRSLY step up";
                    } else if (rb == findViewById(R.id.radioButton3)) {
                        outputText = "GOOD GOOOD";
                    } else if (rb == findViewById(R.id.radioButton4)) {
                        outputText = "Master arrived";
                    } else {
                        outputText = "Useless";
                    }
                    txt.setText(outputText);
                }

            });
            rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    int radio = rg.getCheckedRadioButtonId();
                    rb = findViewById(radio);
                    String outputText = "";
                    if (rb == findViewById(R.id.radioButton1)) {
                        outputText = "You are the KINGG";
                    } else if (rb == findViewById(R.id.radioButton2)) {
                        outputText = "SRSLY step up";
                    } else if (rb == findViewById(R.id.radioButton3)) {
                        outputText = "GOOD GOOOD";
                    } else if (rb == findViewById(R.id.radioButton4)) {
                        outputText = "Master arrived";
                    } else {
                        outputText = "Useless";
                    }
                    Toast.makeText(MainActivity.this, outputText, Toast.LENGTH_SHORT).show();;
                }
            });
        }


    }

}