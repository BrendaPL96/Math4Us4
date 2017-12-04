package com.example.brendaperez.math4us;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.brendaperez.fracc.NivelFrac;
import com.example.brendaperez.fracc.NivelFrac1;
import com.example.brendaperez.fracc1.NivelFracci;
import com.example.brendaperez.fracc1.NivelFracci1;
import com.example.brendaperez.math4us.R;

public class NivelFraccion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nivelfraccion);
    }

    public void goNivelFracc1 (View view){
        Intent objI = new Intent(NivelFraccion.this,NivelFrac1.class);
        startActivity(objI);
    }


    public void goNivelFracc2 (View view){
        Intent objI = new Intent(NivelFraccion.this,NivelFracci1.class);
        startActivity(objI);
    }


}
