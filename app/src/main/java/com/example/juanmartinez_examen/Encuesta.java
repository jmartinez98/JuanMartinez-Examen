package com.example.juanmartinez_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class Encuesta extends AppCompatActivity {

    EditText user2, centro;
    CheckBox cb1, cb2, cb3;
    RadioButton rb1, rb2;
    Bundle user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
        user2 = findViewById(R.id.etUser2);
        centro = findViewById(R.id.etCentro);
        cb1 = findViewById(R.id.cbFutbol);
        cb2 = findViewById(R.id.cbBasket);
        cb3 = findViewById(R.id.cbTennis);
        rb1 = findViewById(R.id.rbSi);
        rb2 = findViewById(R.id.rbSi);

        user = getIntent().getExtras();
        String datoUsuario = user.getString("usuarioEnviado");
        user2.setText(datoUsuario);

    }

    public void Aceptar(View v) {
        Intent intentAcep = new Intent(Encuesta.this, Resumen.class);

        //PREGUNTA 1
        if(cb1.isChecked()==true){
            intentAcep.putExtra("cb1Enviado", cb1.getText()+"");
        } else if (cb2.isChecked() == true) {
            intentAcep.putExtra("cb2Enviado", cb2.getText()+"");
        } else  if (cb3.isChecked() == true) {
            intentAcep.putExtra("cb3Enviado", cb3.getText()+"");
        }

        //PREGUNTA 2
        if (rb1.isChecked() == true) {
            intentAcep.putExtra("rb2Enviado", rb2.getText()+"");
        } else {
            intentAcep.putExtra("rb1Enviado", rb1.getText()+"");
        }

        //PREGUNTA 3
        intentAcep.putExtra("preguntaEnviada", centro.getText().toString());
        intentAcep.putExtra("usuarioEnviado", user2.getText().toString());

        startActivity(intentAcep);

    }
}
