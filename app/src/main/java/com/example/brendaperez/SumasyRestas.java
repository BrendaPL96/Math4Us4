package com.example.brendaperez;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.brendaperez.math4us.R;

public class SumasyRestas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sumasyrestas);
    }

    public void goSumas(View view) {

        Intent objI = new Intent(SumasyRestas.this, SelectNivelSumas.class);
        startActivity(objI);
    }

    public void goRestas(View view){
        Intent objI = new Intent(SumasyRestas.this,SelectNivelResta.class);
        startActivity(objI);
    }
}
