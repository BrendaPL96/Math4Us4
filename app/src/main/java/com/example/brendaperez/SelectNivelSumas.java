package com.example.brendaperez;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.brendaperez.math4us.R;
import com.example.brendaperez.sumas.NivelSuma1;
import com.example.brendaperez.sumas.NivelSuma2;

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
}