package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textview;

    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = findViewById(R.id.textView);
    }

    public void Escribirsiete(View view) {
        float valor = Float.parseFloat(textview.getText().toString());
        if(valor == 0.0f){
            textview.setText("7");
        }else
        textview.setText(textview.getText() + "7");
    }

    public void Escribirocho(View view) {
        float valor = Float.parseFloat(textview.getText().toString());
        if(valor == 0.0f){
            textview.setText("8");
        }else
        textview.setText(textview.getText() + "8");
    }

    public void Escribirnueve(View view) {
        float valor = Float.parseFloat(textview.getText().toString());
        if(valor == 0.0f){
            textview.setText("9");
        }else
        textview.setText(textview.getText() + "9");
    }

    public void Escribircuatro(View view) {
        float valor = Float.parseFloat(textview.getText().toString());
        if(valor == 0.0f){
            textview.setText("4");
        }else
        textview.setText(textview.getText() + "4");
    }

    public void Escribircinco(View view) {
        float valor = Float.parseFloat(textview.getText().toString());
        if(valor == 0.0f){
            textview.setText("5");
        }else
        textview.setText(textview.getText() + "5");
    }

    public void Escribirseis(View view) {
        float valor = Float.parseFloat(textview.getText().toString());
        if(valor == 0.0f){
            textview.setText("6");
        }else
            textview.setText(textview.getText() + "6");
    }

    public void Escribiruno(View view) {
        float valor = Float.parseFloat(textview.getText().toString());
        if(valor == 0.0f){
            textview.setText("1");
        }else
            textview.setText(textview.getText() + "1");
    }

    public void Escribirdos(View view) {
        float valor = Float.parseFloat(textview.getText().toString());
        if(valor == 0.0f){
            textview.setText("2");
        }else
            textview.setText(textview.getText() + "2");
    }

    public void Escribirtres(View view) {
        float valor = Float.parseFloat(textview.getText().toString());
        if(valor == 0.0f){
            textview.setText("3");
        }else
            textview.setText(textview.getText() + "3");
    }

    public void Escribircero(View view) {
        float valor = Float.parseFloat(textview.getText().toString());
        if(valor == 0.0f){
            textview.setText("0.0");
        }else
            textview.setText(textview.getText() + "0");
    }
    public void punto(View view) {
        float valor = Float.parseFloat(textview.getText().toString());
        if(valor == 0.0f){
            textview.setText("0.");
        }else
            textview.setText(textview.getText() + ".");
    }

    public void Limpiar(View view) {
        textview.setText("0.0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
    }

    public void Operaciondividir(View view) {
        numero1 = Float.parseFloat(textview.getText().toString());
        operacion = "/";
        textview.setText("0.0");
        }
    public void Operacionmultiplicar(View view) {
        numero1 = Float.parseFloat(textview.getText().toString());
        operacion = "*";
        textview.setText("0.0");
    }
    public void Operacionsumar(View view) {
        numero1 = Float.parseFloat(textview.getText().toString());
        operacion = "+";
        textview.setText("0.0");
    }
    public void Operacionrestar(View view) {
        numero1 = Float.parseFloat(textview.getText().toString());
        operacion = "-";
        textview.setText("0.0");
    }

    public void Mostrarresultado(View view) {
        numero2 = Float.parseFloat(textview.getText().toString());
            if(operacion.equals("/")) {
                if (numero2 == 0.0f) {
                    textview.setText("0.0");
                    Toast.makeText(this, "Operacion invalida", Toast.LENGTH_LONG).show();
                } else {
                    float result = numero1 / numero2;
                    textview.setText(result + "");
                }
            }else if (operacion.equals("*")){
                float result = numero1 * numero2;
                textview.setText(result + "");
            }else if (operacion.equals("+")) {
                float result = numero1 + numero2;
                textview.setText(result + "");
            }else if (operacion.equals("-")) {
                float result = numero1 - numero2;
                textview.setText(result + "");
            }
            }


}


