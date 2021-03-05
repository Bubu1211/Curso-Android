package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean activo1 = true;

    public void enviar(View view){
        EditText nombre = findViewById(R.id.usuario);
        EditText password = findViewById(R.id.password);

        String usuario = nombre.getText().toString();
        String pass = password.getText().toString();

        if(usuario.equals("") && pass.equals(""))
            Toast.makeText(this, "Error campos vacíos, por favor ingrese valores válidos por favor", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Bienvenido "+usuario+" contra: "+pass , Toast.LENGTH_LONG).show();
    }

    public void cambiarImagen(View view){
        ImageView imagen = findViewById(R.id.image);

        if(activo1){
            imagen.setImageResource(R.drawable.segunda);
            activo1 = false;
        }else{
            imagen.setImageResource(R.drawable.logo);
            activo1 = true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}