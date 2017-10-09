package udlap.ingdesoft.math4us;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.brendaperez.math4us.R;

public class Level1_1 extends AppCompatActivity {

    ImageView one;
    ImageView three;
    ImageView five;
    ImageView question;
    TextView bravo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_1);
        one = (ImageView) findViewById(R.id.One);
        three = (ImageView) findViewById(R.id.Three);
        five = (ImageView) findViewById(R.id.Five);
        question = (ImageView) findViewById(R.id.question);
        bravo = (TextView) findViewById(R.id.bravo);
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