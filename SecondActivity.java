package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private EditText num1EditText;
    private EditText num2EditText;
    private Button additionButton;
    private Button subtractionButton;

    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        num1EditText = findViewById(R.id.num1);
        num2EditText = findViewById(R.id.num2);
        additionButton = findViewById(R.id.Addition);
        subtractionButton = findViewById(R.id.Substraction);
        resultTextView = findViewById(R.id.textResult);

        additionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performAddition();
            }
        });

        subtractionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performSubtraction();
            }
        });
    }

    private void performAddition() {
        int num1 = Integer.parseInt(num1EditText.getText().toString());
        int num2 = Integer.parseInt(num2EditText.getText().toString());
        int sum = num1 + num2;
        resultTextView.setText("Sum : " + sum);
    }

    private void performSubtraction() {
        int num1 = Integer.parseInt(num1EditText.getText().toString());
        int num2 = Integer.parseInt(num2EditText.getText().toString());
        int difference = num1 - num2;
        resultTextView.setText("Difference : " + difference);
    }

    public void returnHome(View v){

        Intent returnHome = new Intent(this,MainActivity.class);
        startActivity(returnHome);
    }

}
