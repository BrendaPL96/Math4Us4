package com.example.brendaperez.math4us;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Estadisticas extends AppCompatActivity {

    TextView nombre, puntaje, nivel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadisticas);


        nombre = (TextView) findViewById(R.id.nombreusuario);
        puntaje = findViewById(R.id.score);
        nivel =  findViewById(R.id.level);

        Intent intent = getIntent();

        String name = intent.getStringExtra("nombre");
        //Log.d("testuserestadisitca", "onResponse: user" + name + "****");
        String score = intent.getStringExtra("nivel");
        String level = intent.getStringExtra("puntaje");




        nombre.setText(name);
        puntaje.setText(score);
        nivel.setText(level);


    }
}
