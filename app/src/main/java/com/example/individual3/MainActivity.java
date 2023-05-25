package com.example.individual3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public int sumar(int a,int b){
        int suma=0;
        suma=a+b;
        return suma;
    }
    public int restar(int a,int b){
        int resta=0;
        resta=a-b;
        return resta;
    }
    public int multi(int a,int b){
        int res=0;
        res=a*b;
        return res;
    }
    public String divid(int a,int b){
        String res="0";
        if(b!=0){
            res=""+a/b;
            return res;
        }else {
            return "Error";
        }}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextNumber1;
        EditText editTextNumber2;
        Button buttonSumar;
        Button buttonRestar;
        Button buttonDividir;
        Button buttonMultiplicar;
        TextView textResultado;

        editTextNumber1 = (EditText) findViewById  (R.id.editTextNumber1);
        editTextNumber2 = (EditText)  findViewById(R.id.editTextNumber2);
        buttonSumar = (Button) findViewById(R.id.buttonSumar);
        buttonRestar = (Button) findViewById(R.id.buttonRestar);
        buttonDividir = (Button) findViewById(R.id.buttonDividir);
        buttonMultiplicar = (Button) findViewById(R.id.buttonMultiplicar);
        textResultado = (TextView) findViewById(R.id.textResultado);



            //variables para el mensaje toast a utilizar
            Context context =getApplicationContext();
            CharSequence text="Falta un número";
            int duracion = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context,text,duracion);


            buttonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextNumber1.getText().toString().equals("") || editTextNumber2.getText().toString().equals("")) {
                    toast.show();
                } else {
                    textResultado.setText(Integer.parseInt(editTextNumber1.getText().toString()) + Integer.parseInt(editTextNumber2.getText().toString()));
                }

            }

            }
        );

        buttonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextNumber1.getText().toString().equals("") || editTextNumber2.getText().toString().equals("")){
                    toast.show();
                }else{
                    textResultado.setText(Integer.parseInt(editTextNumber1.getText().toString()) - Integer.parseInt(editTextNumber2.getText().toString()));
                }
            }
        });

        buttonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(editTextNumber1.getText().toString().equals("") || editTextNumber2.getText().toString().equals("") ){
                toast.show();
            }else{
                textResultado.setText(""+divid(Integer.parseInt(editTextNumber1.getText().toString()),Integer.parseInt(editTextNumber2.getText().toString())));
            }
            }
        });

        buttonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextNumber1.getText().toString().equals("") || editTextNumber2.getText().toString().equals("")) {
                    toast.show();

                }else{
                    textResultado.setText(Integer.parseInt(editTextNumber1.getText().toString()) * Integer.parseInt(editTextNumber2.getText().toString()));
                }

            }
        });



    }
}