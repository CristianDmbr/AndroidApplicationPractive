package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText num1EditText;
    private EditText num2EditText;
    private Button additionButton;
    private Button subtractionButton;
    private Button divisionButton;
    private Button multiplicationButton;
    private Button powerButton;
    private Button remainderButton;
    private Button eButton;
    private Button pieButton;

    private Button delButton;

    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        num1EditText = findViewById(R.id.num1);
        num2EditText = findViewById(R.id.num2);
        additionButton = findViewById(R.id.Addition);
        subtractionButton = findViewById(R.id.Substraction);
        divisionButton = findViewById(R.id.Division);
        multiplicationButton = findViewById(R.id.Multiplication);
        powerButton = findViewById(R.id.Power);
        remainderButton = findViewById(R.id.Remainder);
        eButton = findViewById(R.id.e);
        pieButton = findViewById(R.id.pie);

        delButton = findViewById(R.id.delete);


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

        divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performDivision();
            }
        });

        multiplicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performMultiplication();
            }
        });

        powerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performPower();
            }
        });

        remainderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performRemainder();
            }
        });

        eButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performE();
            }
        });

        pieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performPie();
            }
        });

        delButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performDelete();
            }
        });


    }

    private void performAddition() {
        double num1 = Double.parseDouble(num1EditText.getText().toString());
        double num2 = Double.parseDouble(num2EditText.getText().toString());
        double sum = num1 + num2;
        resultTextView.setText(" " + sum);
    }

    private void performSubtraction() {
        double num1 = Double.parseDouble(num1EditText.getText().toString());
        double num2 = Double.parseDouble(num2EditText.getText().toString());
        double difference = num1 - num2;
        resultTextView.setText(" " + difference);
    }

    private void performDivision() {
        double num1 = Double.parseDouble(num1EditText.getText().toString());
        double num2 = Double.parseDouble(num2EditText.getText().toString());
        double division = num1 / num2;
        resultTextView.setText(" " + division);
    }

    private void performMultiplication() {
        double num1 = Double.parseDouble(num1EditText.getText().toString());
        double num2 = Double.parseDouble(num2EditText.getText().toString());
        double multiplication = num1 * num2;
        resultTextView.setText(" " + multiplication);
    }

    private void performPower() {
        double num1 = Double.parseDouble(num1EditText.getText().toString());
        double num2 = Double.parseDouble(num2EditText.getText().toString());
        double power = Math.pow(num1,num2);
        resultTextView.setText(" " + power);
    }

    private void performRemainder() {
        double num1 = Double.parseDouble(num1EditText.getText().toString());
        double num2 = Double.parseDouble(num2EditText.getText().toString());
        double remainder = num1 % num2;
        resultTextView.setText(" " + remainder);
    }

    private void performE(){
        double num1 = Double.parseDouble(num1EditText.getText().toString());
        double num2 = Double.parseDouble(num2EditText.getText().toString());
        double eMultiplication = num1 * num2 * 2.71828 ;
        resultTextView.setText(" " + eMultiplication);
    }

    private void performPie(){
        double num1 = Double.parseDouble(num1EditText.getText().toString());
        double num2 = Double.parseDouble(num2EditText.getText().toString());
        double pieMultiplication = num1 * num2 * 3.14 ;
        resultTextView.setText(" " + pieMultiplication);
    }

    private void performDelete(){

        num1EditText.setText(" ");
        num2EditText.setText(" ");

        resultTextView.setText(" ");

    }

    public void infoButton(View v) {
        Intent i = new Intent(this,Info.class);
        startActivity(i);
    }
}
