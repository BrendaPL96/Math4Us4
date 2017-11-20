package com.example.brendaperez.math4us;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Response;
import com.example.brendaperez.Categorias;

import org.json.JSONException;
import org.json.JSONObject;

public class Log_in extends AppCompatActivity {

    TextView tv_registrar, et_usuario, et_password;
    Button btn_log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        tv_registrar = findViewById(R.id.registrar);
        et_usuario = findViewById(R.id.user);
        et_password = findViewById(R.id.password);
        btn_log = (Button) findViewById(R.id.entrar);
        tv_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(Log_in.this, Registro.class);
                Log_in.this.startActivity(intento);
            }
        });

        btn_log.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final String username = et_usuario.getText().toString();
                final String password = et_password.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if (success) {

                                //String name = jsonResponse.getString("name");
                                Intent intent = new Intent(Log_in.this, Categorias.class);
                                Log_in.this.startActivity(intent);

                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Log_in.this);
                                builder.setMessage("Error de inicio de sesión").setNegativeButton("Retry", null).create().show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };

                LoginRequest loginRequest = new LoginRequest(username, password, responseListener);

            }
        });
    }
    public void goCategorias (View view){
        Intent objI = new Intent(Log_in.this, Categorias.class);
        startActivity(objI);
    }


}
