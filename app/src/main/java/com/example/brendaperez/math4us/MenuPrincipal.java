package com.example.brendaperez.math4us;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.brendaperez.Categorias;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuprincipal);
    }

    public void cambio (View view) {
        Intent objI = new Intent(MenuPrincipal.this,Categorias.class);
        startActivity(objI);
    }


}