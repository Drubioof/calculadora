package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String lastOp = "";
    private String operacion = "";
    private String number = "";
    private double num1 = 0;
    private double num2 = 0;
    private String symbol;

    private TextView resultado, ultimo;
    private Button keyPad0, keyPad1, keyPad2, keyPad3, keyPad4, keyPad5, keyPad6, keyPad7, keyPad8, keyPad9;
    private Button keyPadSum, keyPadSubstract, keyPadMultiply, keyPadDivision, keyPadEqual, keyPadClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Resultado en pantalla
        resultado =  findViewById(R.id.solucion);

        //Botones de numeros
        keyPad0 = findViewById(R.id.num_cero);
        keyPad1 = findViewById(R.id.num_uno);
        keyPad2 = findViewById(R.id.num_dos);
        keyPad3 = findViewById(R.id.num_tres);
        keyPad4 = findViewById(R.id.num_cuatro);
        keyPad5 = findViewById(R.id.num_cinco);
        keyPad6 = findViewById(R.id.num_seis);
        keyPad7 = findViewById(R.id.num_siete);
        keyPad8 = findViewById(R.id.num_ocho);
        keyPad9 = findViewById(R.id.num_nueve);

        //Botones de operaciones
        keyPadSum = findViewById(R.id.suma);
        keyPadSubstract = findViewById(R.id.resta);
        keyPadDivision = findViewById(R.id.division);
        keyPadMultiply = findViewById(R.id.multiplicacion);
        keyPadClear = findViewById(R.id.borrar);
        keyPadEqual = findViewById(R.id.igual);

        ultimo = findViewById(R.id.ultimo);

        //Listener for num buttons
        keyPad0.setOnClickListener(this);
        keyPad1.setOnClickListener(this);
        keyPad2.setOnClickListener(this);
        keyPad3.setOnClickListener(this);
        keyPad4.setOnClickListener(this);
        keyPad5.setOnClickListener(this);
        keyPad6.setOnClickListener(this);
        keyPad7.setOnClickListener(this);
        keyPad8.setOnClickListener(this);
        keyPad9.setOnClickListener(this);

        //Listener for operations buttons
        keyPadSum.setOnClickListener(this);
        keyPadSubstract.setOnClickListener(this);
        keyPadDivision.setOnClickListener(this);
        keyPadMultiply.setOnClickListener(this);
        keyPadClear.setOnClickListener(this);
        keyPadEqual.setOnClickListener(this);

        ultimo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.num_cero:
                number = number + "0";
                operacion += "0";
                lastOp += "0";
                resultado.setText(operacion);
                break;

            case R.id.num_uno:
                number = number + "1";
                operacion += "1";
                lastOp += "1";
                resultado.setText(operacion);
                break;

            case R.id.num_dos:
                number = number + "2";
                operacion += "2";
                lastOp += "2";
                resultado.setText(operacion);
                break;

            case R.id.num_tres:
                number = number + "3";
                operacion += "3";
                lastOp += "3";
                resultado.setText(operacion);
                break;

            case R.id.num_cuatro:
                number = number + "4";
                operacion += "4";
                lastOp += "4";
                resultado.setText(operacion);
                break;

            case R.id.num_cinco:
                number = number + "5";
                operacion += "5";
                lastOp += "5";
                resultado.setText(operacion);
                break;

            case R.id.num_seis:
                number = number + "6";
                operacion += "6";
                lastOp += "6";
                resultado.setText(operacion);
                break;

            case R.id.num_siete:
                number = number + "7";
                operacion += "7";
                lastOp += "7";
                resultado.setText(operacion);
                break;

            case R.id.num_ocho:
                number = number + "8";
                operacion += "8";
                lastOp += "8";
                resultado.setText(operacion);
                break;

            case R.id.num_nueve:
                number = number + "9";
                operacion += "9";
                lastOp += "9";
                resultado.setText(operacion);
                break;

            case R.id.suma:
                symbol = "+";
                operacion += " + ";
                lastOp += " + ";
                num1 = Integer.parseInt(number);
                number = "";
                resultado.setText(operacion);
                break;

            case R.id.resta:
                symbol = "-";
                operacion += " - ";
                lastOp += " - ";
                num1 = Integer.parseInt(number);
                number = "";
                resultado.setText(operacion);
                break;

            case R.id.division:
                symbol = "/";
                operacion += " / ";
                lastOp += " / ";
                num1 = Integer.parseInt(number);
                number = "";
                resultado.setText(operacion);
                break;

            case R.id.multiplicacion:
                symbol = "*";
                operacion += " * ";
                lastOp += " * ";
                num1 = Integer.parseInt(number);
                number = "";
                resultado.setText(operacion);
                break;

            case R.id.igual:
                num2 = Integer.parseInt(number);
                switch (symbol){
                    case "+":
                        lastOp += " = " + (num1 + num2);
                        resultado.setText("= " + (num1 + num2));
                        break;
                    case "-":
                        lastOp += " = " + (num1 - num2);
                        resultado.setText("= " + (num1 - num2));
                        break;
                    case "/":
                        lastOp += " = " + (num1 / num2);
                        resultado.setText("= " + (num1 / num2));
                        break;
                    case "*":
                        lastOp += " = " + (num1 * num2);
                        resultado.setText("= " + (num1 * num2));
                        break;
                }
                ultimo.setText(lastOp);
                lastOp = "";
                num1 = 0;
                num2 = 0;
                number = "";
                operacion = "";
                break;

            case R.id.borrar:
                symbol = "";
                num1 = 0;
                num2 = 0;
                number = "";
                operacion = "";
                resultado.setText("0");
                break;


        }
    }
}
