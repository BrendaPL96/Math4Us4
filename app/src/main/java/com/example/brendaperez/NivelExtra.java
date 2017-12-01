package com.example.brendaperez;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.brendaperez.combinaciones.NivelCombi_1;
import com.example.brendaperez.math4us.R;

public class NivelExtra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nivelextra);
    }

    public void goToNiv1(View view) {

        Intent objI = new Intent(NivelExtra.this, NivelCombi_1.class);
        startActivity(objI);
    }
}
