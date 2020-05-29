package com.example.juanmartinez_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Resumen extends AppCompatActivity {

    Bundle nombre, user2, centro, pago;
    TextView name, total, txt1, txt2, txt3;
    EditText user3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);
        user3 = findViewById(R.id.etUser3);
        name = findViewById(R.id.txtNombre);
        total = findViewById(R.id.txtTotal);
        txt1 = findViewById(R.id.txtP1);
        txt2 = findViewById(R.id.txtP2);
        txt3 = findViewById(R.id.txtP3);


        user2 = getIntent().getExtras();
        String datoUsuario = user2.getString("usuarioEnviado");
        user3.setText(datoUsuario);

        nombre = getIntent().getExtras();
        String datoNombre = nombre.getString("nombreEnviado");
        name.setText(datoNombre);

        pago = getIntent().getExtras();
        String datoValor = pago.getString("valorEnviado");
        total.setText(datoValor);

        //PREGUNTA 1
        String futbol = getIntent().getStringExtra("cb1Enviado");
        txt1.setText(futbol);
        String basket = getIntent().getStringExtra("cb2Enviado");
        txt1.setText(basket);
        String tennis = getIntent().getStringExtra("cb3Enviado");
        txt1.setText(tennis);

        //PREGUNTA 2
        String si = getIntent().getStringExtra("rb1Enviado");
        txt2.setText(si);
        String no = getIntent().getStringExtra("rb2Enviado");
        txt2.setText(no);

        //PREGUNTA 3
        centro = getIntent().getExtras();
        String datoPregunta = centro.getString("preguntaEnviada");
        txt3.setText(datoPregunta);





    }
}
