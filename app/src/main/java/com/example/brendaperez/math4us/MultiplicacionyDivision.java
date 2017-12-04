package com.example.brendaperez.math4us;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

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
        Intent objI = new Intent(MultiplicacionyDivision.this, SelectNivelDivision.class);
        startActivity(objI);
    }
}
