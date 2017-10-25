package udlap.ingdesoft.math4us;

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

public class Level1_1 extends AppCompatActivity {

    ImageView one;
    ImageView three;
    ImageView five;
    ImageView question;
    TextView bravo;
    LinearLayout leftSum;
    LinearLayout rightSum;
    int digitLeft; //number of pictures on the left
    int digitRight; // number of pictures on the right
    int total; // total number of pictures
    String bravoSumStatic; //the original string in string.xml
    String bravoSum; // the generated string depending on the sum

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_1);
        one = (ImageView) findViewById(R.id.One);
        three = (ImageView) findViewById(R.id.Three);
        five = (ImageView) findViewById(R.id.Five);
        question = (ImageView) findViewById(R.id.question);
        bravo = (TextView) findViewById(R.id.bravo);
        leftSum = (LinearLayout) findViewById(R.id.leftSum);
        rightSum = (LinearLayout) findViewById(R.id.rightSum);

    }

    protected int countBee() {
        // counting the number of bee on each side
        digitLeft = leftSum.getChildCount();
        digitRight = rightSum.getChildCount();
        total = digitLeft + digitRight;
        // generating the congratulation text
        bravoSumStatic = getResources().getString(R.string.bravoSum);
        bravoSum = String.format(bravoSumStatic, digitLeft, digitRight, total);
        bravo.setText(bravoSum);
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

    protected void onClickAll(View v) {
        CharSequence numberText = v.getContentDescription();
        int number = Integer.parseInt(numberText.toString());
        int id = v.getId();
        ImageView image = (ImageView) findViewById(id);
        if (number == countBee()) {
            image.setImageResource(R.drawable.right);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                animate(five);
            }
            if (three.isClickable()) {
                three.setImageResource(R.drawable.wrong);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    animate(three);
                }
            }
            if (one.isClickable()) {
                one.setImageResource(R.drawable.wrong);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    animate(one);
                }
            }
            question.setVisibility(View.GONE);

            bravo.setVisibility(View.VISIBLE);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                animate(bravo);
            }
            five.setClickable(false);
        } else {
            image.setImageResource(R.drawable.wrong);
            image.setClickable(false);

        }
    }


    protected void onClickOne(View v) {
        one.setImageResource(R.drawable.wrong);
    }

    protected void onClickThree(View v) {
        three.setImageResource(R.drawable.wrong);
    }

    protected void onClickFive(View v) {
        five.setImageResource(R.drawable.right);
        question.setVisibility(View.GONE);
        bravo.setVisibility(View.VISIBLE);
    }
}