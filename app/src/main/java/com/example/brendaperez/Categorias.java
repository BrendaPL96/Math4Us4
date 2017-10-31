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

    public void goSumasRestas (View view){
        Intent objI = new Intent(Categorias.this,SumasyRestas.class);
        startActivity(objI);
    }

    public void goMultiDiv (View view){
        Intent objI = new Intent(Categorias.this,MultiplicacionyDivision.class);
        startActivity(objI);
    }

    public void goFraccExtra (View view){
        Intent objI = new Intent(Categorias.this,FraccionesyExtra.class);
        startActivity(objI);
    }

}
