package com.example.brendaperez.math4us;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FraccionesyExtra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fraccionesyextra);
    }

    public void goFraccion (View view){
        Intent objI = new Intent(FraccionesyExtra.this,NivelFraccion.class);
        startActivity(objI);
    }

    public void goExtra (View view){
        Intent objI = new Intent(FraccionesyExtra.this, SelectNivelExtra.class);
        startActivity(objI);
    }
}
