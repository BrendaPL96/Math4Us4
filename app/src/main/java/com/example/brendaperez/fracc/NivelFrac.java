package com.example.brendaperez.fracc;

import android.animation.Animator;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.brendaperez.math4us.R;

public class NivelFrac extends AppCompatActivity {

    ImageView answerLeft;
    String answerLeftString;
    ImageView answerCenter;
    String answerCenterString;
    ImageView answerRight;
    String answerRightString;
    ImageView question;
    TextView bravo;
    ImageView thumb;
    //LinearLayout leftSum;
    //LinearLayout rightSum;
    ImageView imagen;
    String imagenString; //number on the left
    //ImageView digitRight;
    //int digitRightInt; // number of pictures on the right
    //int total; // total number of pictures
    String bravoSumStatic; //the original string in string.xml
    String bravoSum; // the generated string depending on the sum

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        answerLeft = findViewById(R.id.leftAnswer);
        answerLeftString = (answerLeft.getContentDescription()).toString();
        answerCenter = findViewById(R.id.centerAnswer);
        answerCenterString = (answerCenter.getContentDescription()).toString();
        answerRight = findViewById(R.id.rightAnswer);
        answerRightString = (answerRight.getContentDescription()).toString();
        imagen =  findViewById(R.id.pizza);
        imagenString = (imagen.getContentDescription()).toString();
        thumb = findViewById(R.id.thumb);
        bravo = findViewById(R.id.bravo);
        //digitRight =  findViewById(R.id.digitRight);
        //digitRightInt = Integer.parseInt((digitRight.getContentDescription()).toString());
        //bravo = findViewById(R.id.bravo);


    }

/**
     protected int calcAnswer() {
     // counting the number of pictures on each side
     total = digitLeftInt * digitRightInt;
     // generating the congratulation text
     //bravoSumStatic = getResources().getString(R.string.bravoSum);
     //bravoSum = String.format(bravoSumStatic, digitLeft, digitRight, total);
     //bravo.setText(bravoSum);
     //returning the total
     return total;
     }
**/
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

    public void onClickAnswerFrac(View v) {
         /**
        CharSequence numberText = v.getContentDescription(); //read the contentDescription attribute, which is the value of the image in charseq
        int number = Integer.parseInt(numberText.toString()); // convert this value in int
          **/
        int id = v.getId(); // get the id of this image
        ImageView image = findViewById(id); //
        if (image.getContentDescription().toString().equals(answerCenterString)) {
            //bravo.setVisibility(View.VISIBLE);
            thumb.setVisibility(View.VISIBLE);
            bravo.setVisibility(View.VISIBLE);
            image.setImageResource(R.drawable.right);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                animate(image);
            }
                answerRight.setImageResource(R.drawable.wrong);
                answerRight.setClickable(false);
                answerLeft.setImageResource(R.drawable.wrong);
                answerLeft.setClickable(false);

        } else {
            image.setImageResource(R.drawable.wrong);
            image.setClickable(false);
        }
    }

    public ImageView getAnswerLeft(){
         return answerLeft;
    }
    public ImageView getAnswerRight(){
        return answerRight;
    }
    public String getAnswerCenterString(){
        return answerCenterString;
    }
}