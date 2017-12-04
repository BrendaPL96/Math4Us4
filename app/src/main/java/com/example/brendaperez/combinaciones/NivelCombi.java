package com.example.brendaperez.combinaciones;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.TextView;

import com.example.brendaperez.math4us.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class NivelCombi extends AppCompatActivity {

    // attributes
    int question = 0; // TO INCREMENT IF ONCLICK IS TRUE

    // strings

    String opeTextStatic; //the original string in string.xml
    String opeText; // the generated string depending on the operation

    // generating the exercises

    List<String> signsAllowed;
    int min;
    int max;
    int resultMax;

    int randomIntOne;
    String firstOperand;
    int randomIntTwo;
    String secondOperand;
    int randomIntThree;

    Map<TextView, List<Object>> errors = new HashMap<TextView, List<Object>>();

    List<Integer> numbersFirstPos = new ArrayList<>();
    List<String> operandsOne = new ArrayList<>();
    List<Integer> numbersSecondPos = new ArrayList<>();
    List<String> operandsTwo = new ArrayList<>();
    List<Integer> numbersThirdPos = new ArrayList<>();
    List<Integer> answers = new ArrayList<>();

    TextView ope;
    TextView bravo;
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
                randomIntOne = getRandomNumber(min, max); // generate an int between min and max
                firstOperand = signsAllowed.get(getRandomNumber(0, signsAllowed.size() - 1));
                randomIntTwo = getRandomNumber(min, max); // generate another int
                secondOperand = signsAllowed.get(getRandomNumber(0, signsAllowed.size() - 1));
                randomIntThree = getRandomNumber(min, max); // generate an int between min and max
            }
            while (calculateAnswer(randomIntOne, firstOperand, randomIntTwo, secondOperand, randomIntThree) > resultMax);
            numbersFirstPos.add(randomIntOne); // put it on the first pos of the list
            operandsOne.add(firstOperand);
            numbersSecondPos.add(randomIntTwo); // then put it in the list
            operandsTwo.add(secondOperand);
            numbersThirdPos.add(randomIntThree);
            // calc and add the answer
            addAnswer(i);
        }

    }


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
                    case "÷":
                        answers.add(i, numbersFirstPos.get(i) + numbersSecondPos.get(i) / numbersThirdPos.get(i));
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
                    case "÷":
                        answers.add(i, numbersFirstPos.get(i) - numbersSecondPos.get(i) / numbersThirdPos.get(i));
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
                    case "÷":
                        answers.add(i, numbersFirstPos.get(i) * numbersSecondPos.get(i) / numbersThirdPos.get(i));
                        break;
                }
                break;
            case "÷":
                switch (operandsTwo.get(i)) {
                    case "+":
                        answers.add(i, numbersFirstPos.get(i) / numbersSecondPos.get(i) + numbersThirdPos.get(i));
                        break;
                    case "-":
                        answers.add(i, numbersFirstPos.get(i) / numbersSecondPos.get(i) - numbersThirdPos.get(i));
                        break;
                    case "x":
                        answers.add(i, numbersFirstPos.get(i) / numbersSecondPos.get(i) * numbersThirdPos.get(i));
                        break;
                    case "÷":
                        answers.add(i, numbersFirstPos.get(i) / numbersSecondPos.get(i) / numbersThirdPos.get(i));
                        break;
                }
                break;
        }
    }

    public int calculateAnswer(int numOne, String opeOne, int numTwo, String opeTwo, int numThree) {
        int answer = 0;
        switch (opeOne) {
            case "+":
                switch (opeTwo) {
                    case "+":
                        answer = numOne + numTwo + numThree;
                        break;
                    case "-":
                        answer = numOne + numTwo - numThree;
                        break;
                    case "x":
                        answer = numOne + numTwo * numThree;
                        break;
                    case "÷":
                        answer = numOne + numTwo / numThree;
                        break;
                }
                break;
            case "-":
                switch (opeTwo) {
                    case "+":
                        answer = numOne - numTwo + numThree;
                        break;
                    case "-":
                        answer = numOne - numTwo - numThree;
                        break;
                    case "x":
                        answer = numOne - numTwo * numThree;
                        break;
                    case "÷":
                        answer = numOne - numTwo / numThree;
                        break;
                }
                break;
            case "x":
                switch (opeTwo) {
                    case "+":
                        answer = numOne * numTwo + numThree;
                        break;
                    case "-":
                        answer = numOne * numTwo - numThree;
                        break;
                    case "x":
                        answer = numOne * numTwo * numThree;
                        break;
                    case "÷":
                        answer = numOne * numTwo / numThree;
                        break;
                }
                break;
            case "÷":
                switch (opeTwo) {
                    case "+":
                        answer = numOne / numTwo + numThree;
                        break;
                    case "-":
                        answer = numOne / numTwo - numThree;
                        break;
                    case "x":
                        answer = numOne / numTwo * numThree;
                        break;
                    case "÷":
                        answer = numOne / numTwo / numThree;
                        break;
                }
                break;
        }
        return answer;
    }

    public int getRandomNumber(int min, int max) {
        return (new Random()).nextInt((max - min) + 1) + min;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_nivel_divi_1);
        generateNumbers();
        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        answer4 = findViewById(R.id.answer4);
        answer5 = findViewById(R.id.answer5);
        answer6 = findViewById(R.id.answer6);
        answer7 = findViewById(R.id.answer7);
        answer8 = findViewById(R.id.answer8);
        answer9 = findViewById(R.id.answer9);
        ope = findViewById(R.id.ope);
        bravo = findViewById(R.id.bravo);
        generateQuestion();
        generateAnswers();
    }

    public void generateAnswers() {
        List<Integer> tempAnswers = new ArrayList<>();
        for (Integer ans : answers) {
            tempAnswers.add(ans);
        }
        List<TextView> answersTV = Arrays.asList(answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8, answer9);
        for (int i = 8; i >= 0; i--) {
            int number = getRandomNumber(0, i); //generate a random number between 0 and 9
            answersTV.get(i).setText(Integer.toString(tempAnswers.get(number)));
            tempAnswers.remove(number);
        }
    }


    public void generateQuestion() {
        opeTextStatic = getResources().getString(R.string.operation);
        opeText = String.format(opeTextStatic,
                numbersFirstPos.get(question), operandsOne.get(question),
                numbersSecondPos.get(question), operandsTwo.get(question),
                numbersThirdPos.get(question));
        ope.setText(opeText);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    protected void animate(View v) {

        // get the center for the clipping circle
        int cx = v.getWidth() / 2;
        int cy = v.getHeight() / 2;

        // get the final radius for the clipping circle
        float finalRadius = (float) Math.hypot(cx, cy);

        // create the animator for this view (the start radius is zero)
        Animator anim = ViewAnimationUtils.createCircularReveal(v, cx, cy, 0, finalRadius);
        anim.start();

    }

    public void onClick(View v) {

        TextView t = (TextView) v;

        int selectedAnswer = Integer.parseInt((String) t.getText());
        // CASE THERE ARE STILL QUESTIONS
        if (question < 8) {
            // CASE RIGHT
            if (answers.get(question) == selectedAnswer) {
                t.setText("");
                // every 3 questions, put a map instead of a check sign
                if ((question + 1) % 3 == 0) {
                    t.setBackgroundResource(R.drawable.cometa);
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
            t.setBackgroundResource(R.drawable.cometa);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                animate(t);
            }
            ope.setVisibility(View.GONE);
            bravo.setTextSize(22);
            bravo.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            bravo.setText(R.string.bravoCombiCometas);
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            animate(t);
        }
    }

    public void setMinMax(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setSigns(List<String> signs) {
        signsAllowed = signs;
    }

    public void setResultMax(int maxAllowed) {
        resultMax = maxAllowed;
    }
}
