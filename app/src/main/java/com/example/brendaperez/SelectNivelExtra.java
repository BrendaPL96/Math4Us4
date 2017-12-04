package com.example.brendaperez;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.brendaperez.combinaciones.NivelCombi_1;
import com.example.brendaperez.combinaciones.NivelCombi_2;
import com.example.brendaperez.combinaciones.NivelCombi_3;
import com.example.brendaperez.math4us.R;

public class SelectNivelExtra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectnivelextra);
    }

    public void goToNiv1(View view) {

        Intent objI = new Intent(SelectNivelExtra.this, NivelCombi_1.class);
        startActivity(objI);
    }

    public void goToNiv2(View view) {

        Intent objI = new Intent(SelectNivelExtra.this, NivelCombi_2.class);
        startActivity(objI);
    }

    public void goToNiv3(View view) {

        Intent objI = new Intent(SelectNivelExtra.this, NivelCombi_3.class);
        startActivity(objI);
    }
}
