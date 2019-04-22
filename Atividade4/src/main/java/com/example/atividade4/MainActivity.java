package com.example.atividade4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText campo1 = findViewById(R.id.Primeiro);
        EditText campo2 = findViewById(R.id.Segundo);
        EditText campo3 = findViewById(R.id.Terceiro);
        EditText campo4 = findViewById(R.id.Quarto);
        EditText campo5 = findViewById(R.id.Quinto);
        EditText campo6 = findViewById(R.id.Sexto);
        EditText campo7 = findViewById(R.id.Sétimo);

        campo1.setVisibility(View.INVISIBLE);
        campo2.setVisibility(View.INVISIBLE);
        campo3.setVisibility(View.INVISIBLE);
        campo4.setVisibility(View.INVISIBLE);
        campo5.setVisibility(View.INVISIBLE);
        campo6.setVisibility(View.INVISIBLE);
        campo7.setVisibility(View.INVISIBLE);


    }
    @Override
    public void onResume() {

        super.onResume();
        EditText campo1 = findViewById(R.id.Primeiro);
        EditText campo2 = findViewById(R.id.Segundo);
        EditText campo3 = findViewById(R.id.Terceiro);
        EditText campo4 = findViewById(R.id.Quarto);
        EditText campo5 = findViewById(R.id.Quinto);
        EditText campo6 = findViewById(R.id.Sexto);
        EditText campo7 = findViewById(R.id.Sétimo);
        Calendar data = Calendar.getInstance();
        int hora = data.get(Calendar.HOUR_OF_DAY);
        if(hora>=9){
            campo1.setVisibility(View.VISIBLE);
        }
        if(hora>=10){
            campo2.setVisibility(View.VISIBLE);
        }
        if(hora>=11){
            campo3.setVisibility(View.VISIBLE);
        }
        if(hora>=13){
            campo4.setVisibility(View.VISIBLE);
        }
        if(hora>=14){
            campo5.setVisibility(View.VISIBLE);
        }
        if(hora>=15){
            campo6.setVisibility(View.VISIBLE);
        }
        if(hora>=16){
            campo7.setVisibility(View.VISIBLE);
        }
    }
}
