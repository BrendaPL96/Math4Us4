package udlap.ingdesoft.math4us;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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
        digitLeft = leftSum.getChildCount();
        digitRight = rightSum.getChildCount();
        total = digitLeft + digitRight;
        return total;
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