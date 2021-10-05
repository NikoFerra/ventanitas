package com.ventanitas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText cajonNombre, cajonEdad; // ese es un cajon de texto



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cajonNombre = (EditText) findViewById(R.id.nombresito);
        cajonEdad = (EditText) findViewById((R.id.Edad));

    }
     public void abrirVentana(View v)// fuincion que captura la informacion del usuario y la pasara a la otra ventana
     {
        String  Nombre = cajonNombre.getText().toString();// capturamos la info
        Integer Edad  =  Integer.parseInt(cajonEdad.getText().toString());// aca estamos pasado un valor string por lo que enemos que parsearlo para convertirlo en int
         Intent I = new Intent(getApplicationContext(),listado.class);// es como enlasamos con otra ventana g
         I.putExtra("superNombre",Nombre);// entregamos la info al intent- superNombre es la id
         I.putExtra("superEdad",Edad);
         startActivity(I);// aca abre la ventana para que valla la informacion


     }


}