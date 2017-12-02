package com.example.brendaperez.multip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.brendaperez.math4us.R;

public class NivelesTablas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niveles_tablas);
    }

    public void goNivelMulti1 (View view){
        Intent objI = new Intent(NivelesTablas.this, NivelMultip1.class);
        startActivity(objI);
    }

    public void goNivelMulti2 (View view){
        Intent objI = new Intent(NivelesTablas.this, NivelMultip2.class);
        startActivity(objI);
    }

    public void goNivelMulti3 (View view){
        Intent objI = new Intent(NivelesTablas.this, NivelMultip3.class);
        startActivity(objI);
    }

    public void goNivelMulti4 (View view){
        Intent objI = new Intent(NivelesTablas.this, NivelMultip4.class);
        startActivity(objI);
    }

    public void goNivelMulti5 (View view){
        Intent objI = new Intent(NivelesTablas.this, NivelMultip5.class);
        startActivity(objI);
    }

    public void goNivelMulti6 (View view){
        Intent objI = new Intent(NivelesTablas.this, NivelMultip6.class);
        startActivity(objI);
    }

    public void goNivelMulti7 (View view){
        Intent objI = new Intent(NivelesTablas.this, NivelMultip7.class);
        startActivity(objI);
    }

    public void goNivelMulti8 (View view){
        Intent objI = new Intent(NivelesTablas.this, NivelMultip8.class);
        startActivity(objI);
    }

    public void goNivelMulti9 (View view){
        Intent objI = new Intent(NivelesTablas.this, NivelMultip9.class);
        startActivity(objI);
    }

}
