package com.example.brendaperez.divisiones;

import android.os.Bundle;

import com.example.brendaperez.math4us.R;

public class NivelDiviMedio extends NivelDivi {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_nivel_divi_2);
        setMinMax(15, 50);
        super.onCreate(savedInstanceState);
    }
}
