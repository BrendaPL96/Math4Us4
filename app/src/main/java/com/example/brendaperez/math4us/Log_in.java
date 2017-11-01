package com.example.brendaperez.math4us;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.brendaperez.Categorias;

public class Log_in extends AppCompatActivity {

    TextView tv_registrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        tv_registrar = findViewById(R.id.registrar);
        tv_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(Log_in.this, Registro.class);
                Log_in.this.startActivity(intento);
            }
        });
    }
    public void goCategorias (View view){
        Intent objI = new Intent(Log_in.this, Categorias.class);
        startActivity(objI);
    }
}
