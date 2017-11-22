package com.example.brendaperez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.brendaperez.math4us.NivelesTablas;
import com.example.brendaperez.math4us.R;
import com.example.brendaperez.math4us.Tablacinco;
import com.example.brendaperez.math4us.Tablacuatro;
import com.example.brendaperez.math4us.Tablados;
import com.example.brendaperez.math4us.Tablanueve;
import com.example.brendaperez.math4us.Tablaocho;
import com.example.brendaperez.math4us.Tablaseis;
import com.example.brendaperez.math4us.Tablasiete;
import com.example.brendaperez.math4us.Tablatres;
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

    public void goTabla3 (View view){
        Intent objI = new Intent(NivelMultiplicacion.this, Tablatres.class);
        startActivity(objI);
    }

    public void goTabla4 (View view){
        Intent objI = new Intent(NivelMultiplicacion.this, Tablacuatro.class);
        startActivity(objI);
    }

    public void goTabla5 (View view){
        Intent objI = new Intent(NivelMultiplicacion.this, Tablacinco.class);
        startActivity(objI);
    }

    public void goTabla6 (View view){
        Intent objI = new Intent(NivelMultiplicacion.this, Tablaseis.class);
        startActivity(objI);
    }

    public void goTabla7 (View view){
        Intent objI = new Intent(NivelMultiplicacion.this, Tablasiete.class);
        startActivity(objI);
    }

    public void goTabla8 (View view){
        Intent objI = new Intent(NivelMultiplicacion.this, Tablaocho.class);
        startActivity(objI);
    }

    public void goTabla9 (View view){
        Intent objI = new Intent(NivelMultiplicacion.this, Tablanueve.class);
        startActivity(objI);
    }

    public void goNivelesMulti (View view){
        Intent objI = new Intent(NivelMultiplicacion.this, NivelesTablas.class);
        startActivity(objI);
    }
}

