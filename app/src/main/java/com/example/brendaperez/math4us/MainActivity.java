package com.example.brendaperez.math4us;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.brendaperez.Main2Activity;
import com.example.brendaperez.Main6Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cambio (View view) {
        Intent objI = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(objI);
    }

    public void cambio7 (View view){
        Intent objI = new Intent(MainActivity.this, Log_in.class);
        startActivity(objI);
    }
}