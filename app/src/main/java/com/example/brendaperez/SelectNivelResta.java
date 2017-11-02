package com.example.brendaperez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.brendaperez.math4us.R;
import com.example.brendaperez.restas.NivelResta1;
import com.example.brendaperez.restas.NivelResta2;
import com.example.brendaperez.restas.NivelResta3;
import com.example.brendaperez.restas.NivelResta4;
import com.example.brendaperez.restas.NivelResta5;
import com.example.brendaperez.restas.NivelResta6;

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

    public void goNivelResta2 (View view){
        Intent objI = new Intent(SelectNivelResta.this, NivelResta2.class);
        startActivity(objI);
    }

    public void goNivelResta3 (View view){
        Intent objI = new Intent(SelectNivelResta.this, NivelResta3.class);
        startActivity(objI);
    }

    public void goNivelResta4 (View view){
        Intent objI = new Intent(SelectNivelResta.this, NivelResta4.class);
        startActivity(objI);
    }

    public void goNivelResta5 (View view){
        Intent objI = new Intent(SelectNivelResta.this, NivelResta5.class);
        startActivity(objI);
    }

    public void goNivelResta6 (View view){
        Intent objI = new Intent(SelectNivelResta.this, NivelResta6.class);
        startActivity(objI);
    }

}
