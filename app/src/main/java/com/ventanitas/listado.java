package com.ventanitas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class listado extends AppCompatActivity {

    ListView LV;
    ArrayList<String> ListadoDieciochero = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);
        LV =(ListView) findViewById(R.id.Listado);
        ListadoDieciochero.add("empanada");
        ListadoDieciochero.add("vino");
        ListadoDieciochero.add("arrollado");
        ListadoDieciochero.add("sushi");
        ListadoDieciochero.add("series");
        ListadoDieciochero.add("pan de pascua");
        ListadoDieciochero.add("ir al cine");
        ListadoDieciochero.add("completos");
        ListadoDieciochero.add("bailar reegaton");
        ListadoDieciochero.add("pizza");

        ArrayAdapter<String> Adptador = new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,ListadoDieciochero);
        LV.setAdapter(Adptador);

        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String ElementoSeleccionado = LV.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(),"ud eligio: " + ElementoSeleccionado,Toast.LENGTH_SHORT).show();

            }
        });
    }
}