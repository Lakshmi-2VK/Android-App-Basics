package com.example.calculator;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.calculator.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultTextView;
    private int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.resultTextView);
        result = 0;
    }

    public void performOperation(View view) {
        switch (view.getId()) {
            case R.id.addButton:
                result += 10;
                break;
            case R.id.subtractButton:
                result -= 5;
                break;
            case R.id.multiplyButton:
                result *= 2;
                break;
            case R.id.divideButton:
                result /= 2;
                break;
        }

        resultTextView.setText(String.valueOf(result));
    }
}