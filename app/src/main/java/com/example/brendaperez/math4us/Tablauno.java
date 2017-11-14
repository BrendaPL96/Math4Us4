package com.example.brendaperez.math4us;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.brendaperez.NivelMultiplicacion;

public class Tablauno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablauno);
    }

    public void goNivelMulti (View view){
        Intent objI = new Intent(Tablauno.this, NivelMultiplicacion.class);
        startActivity(objI);
    }
}
