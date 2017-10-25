package com.example.brendaperez;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.brendaperez.math4us.R;

import udlap.ingdesoft.math4us.Level1_1;

public class NivelSuma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nivelsuma);
    }

    public void goLvl1(View view) {
        Intent objI = new Intent(NivelSuma.this, Level1_1.class);
        startActivity(objI);
    }
}
