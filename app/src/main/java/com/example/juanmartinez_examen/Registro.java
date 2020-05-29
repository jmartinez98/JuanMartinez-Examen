package com.example.juanmartinez_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    EditText user, nombre, monto, pago;
    Bundle usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        user = findViewById(R.id.etUser);
        nombre = findViewById(R.id.etNombre);
        monto = findViewById(R.id.etMonto);
        pago = findViewById(R.id.etPago);

        usuario = getIntent().getExtras();
        String datoUsuario = usuario.getString("usuarioEnviado");
        user.setText(datoUsuario);
    }

    public void Calcular(View v){
        double valor1, valorfin;

        valor1 = Double.parseDouble(monto.getText().toString());
        valorfin = (((1800 - valor1)/3)*0.05)+((1800 - valor1)/3);
        pago.setText(Double.toString(valorfin));

        Intent intentValor = new Intent(Registro.this, Resumen.class);
        intentValor.putExtra("nombreEnviado", nombre.getText().toString());
        intentValor.putExtra("valorEnviado", pago.getText().toString());
    }

    public void Guardar(View v){

        Intent intentGuardar = new Intent(Registro.this, Encuesta.class);
        intentGuardar.putExtra("usuarioEnviado", user.getText().toString());
        Toast.makeText(getApplicationContext(), "Elemento guardado con exito", Toast.LENGTH_LONG).show();
        startActivity(intentGuardar);

    }




}
