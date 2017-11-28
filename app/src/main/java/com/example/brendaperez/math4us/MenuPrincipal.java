package com.example.brendaperez.math4us;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.brendaperez.Categorias;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuprincipal);
    }

    public void goCategorias (View view) {
        Intent objI = new Intent(MenuPrincipal.this,Categorias.class);
        startActivity(objI);
    }

    public void goLogin (View view){
        Intent objI = new Intent(MenuPrincipal.this, Log_in.class);
        startActivity(objI);
    }

    public  void  goDerechos (View view){
        Intent objI = new Intent(MenuPrincipal.this, Derechos.class);
        startActivity(objI);
    }


}