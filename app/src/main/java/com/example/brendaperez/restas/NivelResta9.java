package com.example.brendaperez.restas;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.brendaperez.math4us.R;

public class NivelResta9 extends NivelResta {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_nivel_resta_9);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int countPic() {
        LinearLayout leftRest2 = findViewById(R.id.leftRest2);
        digitLeft = leftRest2.getChildCount() + leftRest.getChildCount();
        LinearLayout rightRest2 = findViewById(R.id.rightRest2);
        digitRight = rightRest.getChildCount() + rightRest2.getChildCount();
        total = digitLeft - digitRight;
        // generating the congratulation text
        bravoRestStatic = getResources().getString(R.string.bravoRest);
        bravoRest = String.format(bravoRestStatic, digitLeft, digitRight, total);
        bravo.setText(bravoRest);
        //returning the total
        return total;
    }
}