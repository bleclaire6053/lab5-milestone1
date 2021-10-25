package com.example.lab5_milestone1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        EditText username = (EditText) findViewById(R.id.username);
        String str = username.getText().toString();

        SharedPreferences sharedPreferences = getSharedPreferences("com.example.lab5ms1", Context.MODE_PRIVATE);
        sharedPreferences.edit().putString("username", "<login name you get from edit Text").apply();

        goToActivity2(str);
    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String usernameKey = "username";

        SharedPreferences sharedPreferences = getSharedPreferences("c.sakshi.lab5", Context.MODE_PRIVATE);

        if (!sharedPreferences.getString(usernameKey, "").equals("")) {
            //
            //
            //
        } else {
            //
            //
            setContentView(R.layout.activity_main);
        }



    }
}