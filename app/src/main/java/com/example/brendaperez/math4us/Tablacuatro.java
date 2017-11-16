package com.example.brendaperez.math4us;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.brendaperez.NivelMultiplicacion;

public class Tablacuatro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablacuatro);
    }
    public void goNivelMulti4 (View view){
        Intent objI = new Intent(Tablacuatro.this, NivelMultiplicacion.class);
        startActivity(objI);
    }
}
