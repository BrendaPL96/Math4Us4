package com.example.brendaperez.combinaciones;

import android.os.Bundle;

import com.example.brendaperez.math4us.R;

import java.util.Arrays;
import java.util.List;

public class NivelCombi_1 extends NivelCombi {

    List<String> signsToUse = Arrays.asList("+", "-");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_nivel_combi);
        setMinMax(1, 10);
        setSigns(signsToUse);
        setResultMax(100);
        super.onCreate(savedInstanceState);
    }
}