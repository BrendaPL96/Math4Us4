package com.example.brendaperez.combinaciones;

import android.os.Bundle;

import com.example.brendaperez.math4us.R;

import java.util.Arrays;
import java.util.List;

public class NivelCombi_3 extends NivelCombi {

    List<String> signsToUse = Arrays.asList("+", "-", "x", "÷");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_nivel_combi);
        setMinMax(1, 10);
        setSigns(signsToUse);
        setResultMax(1000);
        super.onCreate(savedInstanceState);
    }

    @Override
    public void generateNumbers() {

        // operation numbers

        for (int i = 0; i < 9; i++) { // 9 times for the 9 questions
            //do {
            randomIntOne = getRandomNumber(min, max); // generate an int between min and max
            firstOperand = signsAllowed.get(getRandomNumber(0, signsAllowed.size() - 1));
            randomIntTwo = getRandomNumber(min, max); // generate another int
            if (firstOperand.equals("÷") && (randomIntOne % randomIntTwo != 0)) {
                do {
                    randomIntOne = getRandomNumber(min, max);
                    randomIntTwo = getRandomNumber(min, max);
                } while ((randomIntOne % randomIntTwo != 0));
                }
            secondOperand = signsAllowed.get(getRandomNumber(0, signsAllowed.size() - 1));
            randomIntThree = getRandomNumber(min, max); // generate an int between min and max
            if (secondOperand.equals("÷") && (randomIntTwo % randomIntThree != 0) || ((randomIntOne / randomIntTwo) % randomIntThree) != 0) {
                do {
                    randomIntOne = getRandomNumber(min, max);
                    randomIntTwo = getRandomNumber(min, max);
                    randomIntThree = getRandomNumber(min, max);
                }
                while ((randomIntOne % randomIntTwo != 0) || (randomIntTwo % randomIntThree != 0) || ((randomIntOne / randomIntTwo) % randomIntThree) != 0);
            }
            //}
            //while ((Collections.frequency(answers, randomIntOne / randomIntTwo)) > 1);
            numbersFirstPos.add(randomIntOne); // put it on the first pos of the list
            operandsOne.add(firstOperand);
            numbersSecondPos.add(randomIntTwo); // then put it in the list
            operandsTwo.add(secondOperand);
            numbersThirdPos.add(randomIntThree);
            // calc and add the answer
            addAnswer(i);
        }

    }
}