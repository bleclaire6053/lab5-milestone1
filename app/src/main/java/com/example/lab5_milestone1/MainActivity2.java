package com.example.lab5_milestone1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        textView2.setText("Welcome " + str + "!");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    

    public void goToActivity1() {
        Intent intent = new Intent(this, MainActivity.class);
        //intent.putExtra("message", s);
        startActivity(intent);

    }

    @Override
    public boolean onOptionsItemSelected (@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        if (item.getItemId() == R.id.logout) {
            //Erase username from shared references
            Intent intent = new Intent(this, MainActivity.class);
            SharedPreferences sharedPreferences = getSharedPreferences("c.sakshi.lab5", Context.MODE_PRIVATE);
            //sharedPreferences.edit().remove(MainActivity.usernameKey).apply();
            startActivity(intent);
            return true;
        }
        return false;
    }
}