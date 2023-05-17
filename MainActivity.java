package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void info(View view){
        Intent j = new Intent(this,infoScreen.class);
        startActivity(j);
    }

    public void enterButton(View v){

        TextView nameInput = findViewById(R.id.userName);
        String username = nameInput.getText().toString();

        TextView passwordInput = findViewById(R.id.password);
        String password = passwordInput.getText().toString();

        if (username.equals("Cristian") && password.equals("Dumbravanu")){
            Intent i = new Intent(this,displayScreen.class);
            startActivity(i);

        } else {
            Toast.makeText(this,"The username : " + username + " and the password : " + password + " arent corrent",Toast.LENGTH_LONG).show();
        }


    }

}
