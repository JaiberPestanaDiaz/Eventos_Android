package com.example.loginregistro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import com.example.loginregistro.models.AutenticacionLoginModel;
import com.example.loginregistro.models.AutenticacionResModel;
import com.example.loginregistro.interfaces.autenticacionAPI;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    EditText eTusuario;
    EditText eTpass;
    Button btnLogin;
    TextView btnRegistrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTusuario = findViewById(R.id.eTusuario);
        eTpass = findViewById(R.id.eTpass);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegistrarse = findViewById(R.id.btnRegistrarse);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String correo = eTusuario.getText().toString();
                String password = eTpass.getText().toString();

                if (!correo.isEmpty() && !password.isEmpty()) {
                    autenticacionAPI autenticacionAPI = new clienteAPI().getClient().create(autenticacionAPI.class);

                    AutenticacionLoginModel autenticacionLoginModel = new AutenticacionLoginModel();
                    autenticacionLoginModel.setCorreo(correo);
                    autenticacionLoginModel.setPassword(password);

                    Call<AutenticacionResModel> resModelCall = autenticacionAPI.postLogin(autenticacionLoginModel);

                    resModelCall.enqueue(new Callback<AutenticacionResModel>() {
                        @Override
                        public void onResponse(Call<AutenticacionResModel> call, Response<AutenticacionResModel> response) {
                            if (response.isSuccessful()) {
                                startActivity(new Intent(MainActivity.this,Principal.class));
                            } else {
                                Toast.makeText(MainActivity.this, "ERROR: Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onFailure(Call<AutenticacionResModel> call, Throwable t) {
                            Toast.makeText(MainActivity.this, "Falló la petición" + t.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });

                } else {
                    Toast.makeText(MainActivity.this, "ERROR: Los campos son obligatorios", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
