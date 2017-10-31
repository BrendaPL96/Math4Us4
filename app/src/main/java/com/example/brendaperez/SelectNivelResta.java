package com.example.brendaperez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.brendaperez.math4us.R;
import com.example.brendaperez.restas.NivelResta1;

public class SelectNivelResta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectnivelresta);
    }

    public void goNivelResta (View view){
        Intent objI = new Intent(SelectNivelResta.this, NivelResta1.class);
        startActivity(objI);
    }
}
