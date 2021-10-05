package com.ventanitas;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ventanita2 extends AppCompatActivity {

    TextView Mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventanita2);
        Mostrar = (TextView) findViewById(R.id.Mensaje);

        Bundle B = getIntent().getExtras();// resivir informacion de otraventana - este es un contenedor que resive info -

        String NombreResivido = B.getString("superNombre");
        Integer miEdad = B.getInt("superEdad");
        if (miEdad >= 18)
        {
            Mostrar.setText("Hola  estimado : " + NombreResivido);
        }
        else{
            Mostrar.setText("lo siento, la aplicacion solo es valida para mayores de edad, 18 años o mas");
        }


    }
    public void Volver(View v)
    {
        Intent I = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(I);

    }


}