package com.example.brendaperez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.brendaperez.math4us.MainActivity;
import com.example.brendaperez.math4us.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void cambio2 (View view){
        Intent objI = new Intent(Main2Activity.this,Main3Activity.class);
        startActivity(objI);
    }

    public void cambio3 (View view){
        Intent objI = new Intent(Main2Activity.this, Main4Activity.class);
        startActivity(objI);
    }

    public void cambio4 (View view){
        Intent objI = new Intent(Main2Activity.this, Main5Activity.class);
        startActivity(objI);
    }

}
