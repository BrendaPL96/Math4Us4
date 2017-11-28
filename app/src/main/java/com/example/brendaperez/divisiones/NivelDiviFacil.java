package com.example.brendaperez.divisiones;

import android.os.Bundle;

import com.example.brendaperez.math4us.R;

public class NivelDiviFacil extends NivelDivi {

    int min = 1;
    int max = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_nivel_divi1);
        super.onCreate(savedInstanceState);
    }
}
