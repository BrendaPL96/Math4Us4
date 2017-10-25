package com.example.brendaperez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.brendaperez.math4us.MenuPrincipal;
import com.example.brendaperez.math4us.R;

public class SumasyRestas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sumasyrestas);
    }
    public void cambio7 (View view){
        Intent objI = new Intent(SumasyRestas.this,NivelSuma.class);
    }
}
