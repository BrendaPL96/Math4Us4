package com.example.brendaperez.divisiones;

import android.os.Bundle;

import com.example.brendaperez.math4us.R;

public class NivelDiviDificil extends NivelDivi {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_nivel_divi_3);
        setMinMax(25, 100);
        super.onCreate(savedInstanceState);
    }
}
