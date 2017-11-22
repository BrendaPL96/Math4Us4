package com.example.brendaperez;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.brendaperez.divisiones.NivelDivi1;
import com.example.brendaperez.math4us.R;

public class NivelDivision extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.niveldivision);
    }

    public void goDivi1(View view) {

        Intent objI = new Intent(NivelDivision.this, NivelDivi1.class);
        startActivity(objI);
    }
}
