package com.joao.recuperacaoprova2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    TextView txtContador;
    int numero = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtContador = findViewById(R.id.contador);

    }

    public void somarUm(View view) {
        numero++;
        setaValor();

    }

    public void subtraiUm(View view) {
        numero = numero - 1;
        setaValor();
    }

    public void zeraContador(View view) {
        numero = 0;
        setaValor();
    }

    private void setaValor() {
        txtContador.setText(Integer.toString(numero));
    }


}


