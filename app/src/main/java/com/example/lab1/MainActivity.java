package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {

    public Button convert_am_button;
    public Button convert_eu_button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convert_am_button = findViewById(R.id.convert_am_button);
        convert_eu_button = findViewById(R.id.convert_eu_button);
    }


    public void openAMconverter(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void openEUconverter(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

}
