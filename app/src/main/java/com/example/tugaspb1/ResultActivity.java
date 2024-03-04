package com.example.tugaspb1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {


    EditText EditTextLengthResult, EditTextWidthResult, EditTextAreaResult, EditTextCircumferenceResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        EditTextLengthResult = findViewById(R.id.LengthResult);
        EditTextWidthResult = findViewById(R.id.WidthResult);
        EditTextAreaResult = findViewById(R.id.AreaResult);
        EditTextCircumferenceResult = findViewById(R.id.CircumferenceResult);

        Intent intent = getIntent();
            double length = intent.getDoubleExtra("LENGTH", 0);
            double width = intent.getDoubleExtra("WIDTH", 0);
            double area = intent.getDoubleExtra("AREA", 0);
            double circumference = intent.getDoubleExtra("CIRCUMFERENCE", 0);

            EditTextLengthResult.setText(String.valueOf(length));
            EditTextWidthResult.setText(String.valueOf(width));
            EditTextAreaResult.setText(String.valueOf(area));
            EditTextCircumferenceResult.setText(String.valueOf(circumference));
        }
    }

