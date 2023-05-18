package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void infoPage(View v){
        Intent infoPages = new Intent(this,InfoPage.class);
        startActivity(infoPages);
    }

    public void enterButton(View v){
        EditText usernameInput = findViewById(R.id.editTextTextPersonName);
        String input = usernameInput.getText().toString();

        if(input.equals("Cristian")){
            Intent secondActivity = new Intent(this,SecondActivity.class);
            startActivity(secondActivity);
        } else {
            Toast.makeText(this,input + " is not registered try a new name.",Toast.LENGTH_LONG).show();
        }
    }

}
