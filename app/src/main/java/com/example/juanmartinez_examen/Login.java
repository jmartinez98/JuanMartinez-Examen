package com.example.juanmartinez_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText usuario, clave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usuario = findViewById(R.id.etUsuario);
        clave = findViewById(R.id.etClave);
    }

    public void Ingresar(View v){
        Intent intentIng = new Intent(Login.this, Registro.class);
        String user = usuario.getText().toString();
        String pass = clave.getText().toString();

        if(user.equals("estudiante2020") && pass.equals("uisrael2020")){
            intentIng.putExtra("usuarioEnviado", usuario.getText().toString());
            Toast.makeText(getApplicationContext(), "Bienvenido usuario", Toast.LENGTH_LONG).show();
            startActivity(intentIng);
        } else {
            Toast.makeText(getApplicationContext(), "Usuario o clave incorrecta", Toast.LENGTH_LONG).show();
        }

    }
}
