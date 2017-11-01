package com.example.brendaperez;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.brendaperez.math4us.R;
import com.example.brendaperez.sumas.NivelSuma1;
import com.example.brendaperez.sumas.NivelSuma2;
import com.example.brendaperez.sumas.NivelSuma3;
import com.example.brendaperez.sumas.NivelSuma4;
import com.example.brendaperez.sumas.NivelSuma5;
import com.example.brendaperez.sumas.NivelSuma6;
import com.example.brendaperez.sumas.NivelSuma7;

public class SelectNivelSumas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectnivelsuma);
    }

    public void goLvl1(View view) {
        Intent objI = new Intent(SelectNivelSumas.this, NivelSuma1.class);
        startActivity(objI);
    }

    public void goLvl2(View view) {
        Intent objI = new Intent(SelectNivelSumas.this, NivelSuma2.class);
        startActivity(objI);
    }

    public void goLvl3 (View view){
        Intent objI = new Intent(SelectNivelSumas.this, NivelSuma3.class);
        startActivity(objI);
    }

    public void goLvl4 (View view){
        Intent objI = new Intent(SelectNivelSumas.this,NivelSuma4.class);
        startActivity(objI);
    }

    public void goLvl5 (View view){
        Intent objI = new Intent(SelectNivelSumas.this, NivelSuma5.class);
        startActivity(objI);
    }

    public void goLvl6 (View view){
        Intent objI = new Intent(SelectNivelSumas.this, NivelSuma6.class);
        startActivity(objI);
    }

    public void goLvl7 (View view){
        Intent objI = new Intent(SelectNivelSumas.this, NivelSuma7.class);
        startActivity(objI);
    }

}