package com.example.brendaperez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.brendaperez.math4us.R;

public class MultiplicacionyDivision extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiplicacionydivision);
    }

    public void goMulti (View view){
        Intent objI = new Intent(MultiplicacionyDivision.this,NivelMultiplicacion.class);
        startActivity(objI);
    }

    public void goDivision (View view){
        Intent objI = new Intent(MultiplicacionyDivision.this,NivelDivision.class);
        startActivity(objI);
    }
}
