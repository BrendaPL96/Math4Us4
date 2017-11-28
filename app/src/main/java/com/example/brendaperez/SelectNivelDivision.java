package com.example.brendaperez;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.brendaperez.divisiones.NivelDivi;
import com.example.brendaperez.math4us.R;

public class SelectNivelDivision extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectniveldivision);
    }

    public void goNivelDiviFacil(View view) {

        Intent objI = new Intent(SelectNivelDivision.this, NivelDivi.class);
        startActivity(objI);
    }
}
