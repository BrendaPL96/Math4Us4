package com.example.brendaperez.sumas;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.brendaperez.math4us.R;

public class NivelSuma9 extends NivelSuma {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_nivel_suma_9);
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int countPic() {
        LinearLayout leftSum2 = findViewById(R.id.leftSum2);
        digitLeft = leftSum2.getChildCount() + leftSum.getChildCount();
        LinearLayout rightSum2 = findViewById(R.id.rightSum2);
        digitRight = rightSum.getChildCount() + rightSum2.getChildCount();
        total = digitLeft + digitRight;
        // generating the congratulation text
        bravoSumStatic = getResources().getString(R.string.bravoSum);
        bravoSum = String.format(bravoSumStatic, digitLeft, digitRight, total);
        bravo.setText(bravoSum);
        //returning the total
        return total;
    }
}