package com.example.convertidor_monedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convertir(View view){
        EditText editText = findViewById(R.id.editText);
        String pesosString = editText.getText().toString();
        double pesos = Double.parseDouble(pesosString);
        double dolares = pesos * 20.11;
        String dolaresString = String.format("%.2f", dolares);
        Toast.makeText(this, dolaresString, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}