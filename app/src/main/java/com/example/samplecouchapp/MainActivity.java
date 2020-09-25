package com.example.samplecouchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText addNameHereET;
    Button addServerData;
    Button fetchServerData;
    TextView resutls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addNameHereET = findViewById(R.id.addNameHereET);
        addServerData = findViewById(R.id.updateServerData);
        fetchServerData = findViewById(R.id.fetchServerData);
        resutls = findViewById(R.id.results);
    }
}