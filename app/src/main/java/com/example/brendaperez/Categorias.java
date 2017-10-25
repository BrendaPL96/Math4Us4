package com.example.brendaperez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.brendaperez.math4us.R;

public class Categorias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categorias);
    }

    public void cambio2 (View view){
        Intent objI = new Intent(Categorias.this,SumasyRestas.class);
        startActivity(objI);
    }

    public void cambio3 (View view){
        Intent objI = new Intent(Categorias.this, NivelMultiplicacion.class);
        startActivity(objI);
    }

    public void cambio4 (View view){
        Intent objI = new Intent(Categorias.this, NivelFraccion.class);
        startActivity(objI);
    }

}
