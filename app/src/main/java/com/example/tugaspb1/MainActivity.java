package com.example.tugaspb1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextLength, editTextWidth;
    Button buttonCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextLength = findViewById(R.id.editTextLength);
        editTextWidth = findViewById(R.id.editTextWidth);
        buttonCalculate = findViewById(R.id.buttonCalculate);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculateAndDisplay();
            }
        });
    }

    private void CalculateAndDisplay(){

                double length = Double.parseDouble(editTextLength.getText().toString());
                double width = Double.parseDouble(editTextWidth.getText().toString());

                double area = length * width;
                double circumference = 2 * (length + width);

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("LENGTH", length);
                intent.putExtra("WIDTH", width);
                intent.putExtra("AREA", area);
                intent.putExtra("CIRCUMFERENCE", circumference);
                startActivity(intent);
    }
}