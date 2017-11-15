package com.example.brendaperez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.brendaperez.math4us.R;
import com.example.brendaperez.math4us.Tablados;
import com.example.brendaperez.math4us.Tablauno;
import com.example.brendaperez.sumas.NivelSuma4;

public class NivelMultiplicacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nivelmultiplicacion);
    }

    public void goTabla1 (View view){
        Intent objI = new Intent(NivelMultiplicacion.this, Tablauno.class);
        startActivity(objI);
    }

    public void goTabla2 (View view){
        Intent objI = new Intent(NivelMultiplicacion.this,Tablados.class);
        startActivity(objI);
    }
}

