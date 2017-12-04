package com.example.brendaperez.combinaciones;

import android.os.Bundle;

import com.example.brendaperez.math4us.R;

import java.util.Arrays;
import java.util.List;

public class NivelCombi_2 extends NivelCombi {

    List<String> signsToUse = Arrays.asList("+", "-", "x");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_nivel_combi);
        setMinMax(1, 10);
        setSigns(signsToUse);
        setResultMax(500);
        super.onCreate(savedInstanceState);
    }

    @Override
    public void addAnswer(int i) {
        switch (operandsOne.get(i)) {
            case "+":
                switch (operandsTwo.get(i)) {
                    case "+":
                        answers.add(i, numbersFirstPos.get(i) + numbersSecondPos.get(i) + numbersThirdPos.get(i));
                        break;
                    case "-":
                        answers.add(i, numbersFirstPos.get(i) + numbersSecondPos.get(i) - numbersThirdPos.get(i));
                        break;
                    case "x":
                        answers.add(i, numbersFirstPos.get(i) + numbersSecondPos.get(i) * numbersThirdPos.get(i));
                        break;
                }
                break;
            case "-":
                switch (operandsTwo.get(i)) {
                    case "+":
                        answers.add(i, numbersFirstPos.get(i) - numbersSecondPos.get(i) + numbersThirdPos.get(i));
                        break;
                    case "-":
                        answers.add(i, numbersFirstPos.get(i) - numbersSecondPos.get(i) - numbersThirdPos.get(i));
                        break;
                    case "x":
                        answers.add(i, numbersFirstPos.get(i) - numbersSecondPos.get(i) * numbersThirdPos.get(i));
                        break;
                }
                break;
            case "x":
                switch (operandsTwo.get(i)) {
                    case "+":
                        answers.add(i, numbersFirstPos.get(i) * numbersSecondPos.get(i) + numbersThirdPos.get(i));
                        break;
                    case "-":
                        answers.add(i, numbersFirstPos.get(i) * numbersSecondPos.get(i) - numbersThirdPos.get(i));
                        break;
                    case "x":
                        answers.add(i, numbersFirstPos.get(i) * numbersSecondPos.get(i) * numbersThirdPos.get(i));
                        break;
                }
                break;
        }
    }
}