package com.example.brendaperez.combinaciones;

import android.os.Bundle;

import com.example.brendaperez.math4us.R;

import java.util.Arrays;
import java.util.List;

public class NivelCombi_2 extends NivelCombi {

    List<String> signsToUse = Arrays.asList("+", "-", "x");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_nivel_combi_1);
        setMinMax(1, 10);
        setSigns(signsToUse);
        super.onCreate(savedInstanceState);
    }

    //@Override
    protected void calculateAnswer(int i) {
        switch (operandsOne.get(i)) {
            case "+":

        }
        if (operandsOne.get(i).equals("+")) {
            if (operandsTwo.get(i).equals("+")) {
                answers.add(i, numbersFirstPos.get(i) + numbersSecondPos.get(i) + numbersThirdPos.get(i));
            } else {
                answers.add(i, numbersFirstPos.get(i) + numbersSecondPos.get(i) - numbersThirdPos.get(i));
            }
        } else {
            if (operandsTwo.get(i).equals("+")) {
                answers.add(i, numbersFirstPos.get(i) - numbersSecondPos.get(i) + numbersThirdPos.get(i));
            } else {
                answers.add(i, numbersFirstPos.get(i) - numbersSecondPos.get(i) - numbersThirdPos.get(i));
            }
        }
    }
}