package com.example.brendaperez.math4us;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.brendaperez.Categorias;

import org.json.JSONException;
import org.json.JSONObject;

public class Registro extends AppCompatActivity {


    EditText nombre, usuario, contraseña;
    Button btn_registrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nombre = (EditText) findViewById(R.id.nuevoNombre);
        usuario = (EditText) findViewById(R.id.nuevoUsuario);
        contraseña = (EditText) findViewById(R.id.contraseña);

        btn_registrar = (Button) findViewById(R.id.registrarse);

        btn_registrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final String username = usuario.getText().toString();
                final String name = nombre.getText().toString();
                final String pass = contraseña.getText().toString();

                if(!username.isEmpty() && !name.isEmpty() && !pass.isEmpty()) {
                    Response.Listener<String> respoListener = new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONObject jsonResponse = new JSONObject(response);
                                boolean success = jsonResponse.getBoolean("success");
                                if (success) {
                                    Intent intent = new Intent(Registro.this, MenuPrincipal.class);
                                    Registro.this.startActivity(intent);
                                } else {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Registro.this);
                                    builder.setMessage("Error de Registro").setNegativeButton("Retry", null).create().show();
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    };

                    RegisterRequest registerRequest = new RegisterRequest(username, name, pass, respoListener);
                    RequestQueue queue = Volley.newRequestQueue(Registro.this);
                    queue.add(registerRequest);
                }else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(Registro.this);
                    builder.setMessage("REVISA TUS DATOS").setNegativeButton("Intentar de nuevo", null).create().show();
                }
            }
        });
    }
}