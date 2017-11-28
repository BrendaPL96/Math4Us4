package com.example.brendaperez.divisiones;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.example.brendaperez.math4us.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class NivelDivi extends AppCompatActivity {

    // attributes
    int question = 0; // TO INCREEMENT IF ONCLICK IS TRUE

    // generating the exercises
    int randomintleft;
    int randomintright;
    int min = 1;
    int max = 20;
    Map<TextView, List<Object>> errors = new HashMap<TextView, List<Object>>();
    List<Integer> numbersLeft = new ArrayList<>();
    List<Integer> numbersRight = new ArrayList<>();
    List<Integer> answers = new ArrayList<>();
    TextView numberLeft;
    TextView numberRight;
    TextView divide;
    TextView equals;
    TextView answer1;
    TextView answer2;
    TextView answer3;
    TextView answer4;
    TextView answer5;
    TextView answer6;
    TextView answer7;
    TextView answer8;
    TextView answer9;

    public void generateNumbers() {

        // operation numbers

        for (int i = 0; i < 9; i++) { // 9 times for the 9 questions
            do {
                randomintleft = getRandomNumber(min, max); // generate an int between 1 and 20
                randomintright = getRandomNumber(min, randomintleft); // generate another int
            }
            while ((randomintleft % randomintright != 0) || (Collections.frequency(answers, randomintleft / randomintright)) > 2);
            numbersLeft.add(randomintleft); // put it on the first pos of the list
            numbersRight.add(randomintright); // then put it in the list
            answers.add(i, numbersLeft.get(i) / numbersRight.get(i));
        }

    }

    private int getRandomNumber(int min, int max) {
        return (new Random()).nextInt((max - min) + 1) + min;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel_divi1);
        generateNumbers();
        numberLeft = findViewById(R.id.numberLeft);
        numberRight = findViewById(R.id.numberRight);
        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        answer4 = findViewById(R.id.answer4);
        answer5 = findViewById(R.id.answer5);
        answer6 = findViewById(R.id.answer6);
        answer7 = findViewById(R.id.answer7);
        answer8 = findViewById(R.id.answer8);
        answer9 = findViewById(R.id.answer9);
        divide = findViewById(R.id.dividedBy);
        equals = findViewById(R.id.equals);
        generateQuestion();
        generateAnswers();
    }

    public void generateAnswers() {
        List<Integer> tempAnswers = answers;
        List<TextView> answersTV = Arrays.asList(answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8, answer9);
        for (int i = 8; i >= 0; i--) {
            int number = getRandomNumber(0, i); //generate a random number between 0 and 9
            answersTV.get(i).setText(Integer.toString(tempAnswers.get(number)));
            tempAnswers.remove(number);
        }

    }


    public void generateQuestion() {
        numberLeft.setText(Integer.toString(numbersLeft.get(question)));
        numberRight.setText(Integer.toString(numbersRight.get(question)));
    }

    public void onClick(View v) {

        TextView t = (TextView) v;

        int selectedAnswer = Integer.parseInt((String) t.getText());
        // CASE THERE ARE STILL QUESTIONS
        if (question < 8) {
            // CASE RIGHT
            if ((Integer.parseInt(numberLeft.getText().toString()) / (Integer.parseInt(numberRight.getText().toString()))) == selectedAnswer) {
                t.setText("");
                // every 3 questions, put a map instead of a check sign
                if ((question + 1) % 3 == 0) {
                    t.setBackgroundResource(R.drawable.worldmap);
                } else {
                    t.setBackgroundResource(R.drawable.right);
                }
                // as the answer is good, disable the ability to click on it
                t.setClickable(false);
                // for each wrong answer clicked before the right one, restore its properties
                for (Map.Entry<TextView, List<Object>> error : errors.entrySet()) {
                    error.getKey().setText(error.getValue().get(0).toString());
                    error.getKey().setBackground((Drawable) error.getValue().get(1));
                    error.getKey().setClickable(true);
                }
                // claer the error map
                errors.clear();
                // increase the question count, then generate the new question
                question++;
                generateQuestion();
                // CASE WRONG
            } else {
                // key :TextView value: result that was in this textview / flag background drawable
                errors.put((TextView) v, Arrays.asList(((TextView) v).getText().toString(), v.getBackground()));
                t.setBackgroundResource(R.drawable.wrong);
                t.setClickable(false);
            }
            // CASE IT WAS THE LAST QUESTION
        } else {
            t.setText("");
            t.setBackgroundResource(R.drawable.worldmap);
            numberLeft.setText("");
            numberRight.setText("");
            equals.setText("");
            divide.setTextSize(20);
            divide.setGravity(Gravity.CENTER);
            divide.setText(R.string.bravoDiviMap);
        }
    }
}
