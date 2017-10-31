package com.example.brendaperez.restas;

import android.animation.Animator;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.brendaperez.math4us.R;

public class NivelResta extends AppCompatActivity {

    ImageView answerLeft;
    ImageView answerCenter;
    ImageView answerRight;
    ImageView question;
    TextView bravo;
    LinearLayout leftRest;
    LinearLayout rightRest;
    int digitLeft; //number of pictures on the left
    int digitRight; // number of pictures on the right
    int total; // total number of pictures
    String bravoRestStatic; //the original string in string.xml
    String bravoRest; // the generated string depending on the rest

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        answerLeft = findViewById(R.id.leftAnswer);
        answerCenter = findViewById(R.id.centerAnswer);
        answerRight = findViewById(R.id.rightAnswer);
        question = findViewById(R.id.question);
        bravo = findViewById(R.id.bravo);
        leftRest = findViewById(R.id.leftRest);
        rightRest = findViewById(R.id.rightRest);

    }


    protected int countPic() {
        // counting the number of pictures on each side
        digitLeft = leftRest.getChildCount();
        digitRight = rightRest.getChildCount();
        total = digitLeft - digitRight;
        // generating the congratulation text
        bravoRestStatic = getResources().getString(R.string.bravoRest);
        bravoRest = String.format(bravoRestStatic, digitLeft, digitRight, total);
        bravo.setText(bravoRest);
        //returning the total
        return total;
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

    protected void onClickAnswer(View v) {
        CharSequence numberText = v.getContentDescription();
        int number = Integer.parseInt(numberText.toString());
        int id = v.getId();
        ImageView image = findViewById(id);
        if (number == countPic()) {
            image.setImageResource(R.drawable.right);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                animate(answerRight);
            }
            if (answerCenter.isClickable()) {
                answerCenter.setImageResource(R.drawable.wrong);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    animate(answerCenter);
                }
            }
            if (answerLeft.isClickable()) {
                answerLeft.setImageResource(R.drawable.wrong);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    animate(answerLeft);
                }
            }
            question.setVisibility(View.GONE);

            bravo.setVisibility(View.VISIBLE);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                animate(bravo);
            }
            answerRight.setClickable(false);
        } else {
            image.setImageResource(R.drawable.wrong);
            image.setClickable(false);

        }
    }
}