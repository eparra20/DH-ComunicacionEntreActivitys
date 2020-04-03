package com.example.comunicacionentreactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private Button buttonIr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.buttonIr = findViewById(R.id.buttonIr);


        this.buttonIr.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                //creo intencion
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                //creo bundle o valija.
                Bundle unBundle = new Bundle();
                unBundle.putString("saludo","HOLA DESDE LA PRIMERA ACTIVIDAD");

                //asociar el bundle al intent, conectarlos.
                intent.putExtras(unBundle);

                startActivity(intent);
            }
        });

    }


    public void algo(){
        //diccionario
        // CLAVE , VALOR
        Map<String,String> unDiccionario = new HashMap<>();
        unDiccionario.put("a","Primera letra del ABECEDARIO");
        unDiccionario.get("a");


        //Bundle ES UN DICCIONARIO CON EXTEROIDES.
        //Es lo que usa android para compartir informacion.
        Bundle unBundle = new Bundle();
        unBundle.putString("a","Primera letra del ABECEDARIO");
        String valor = unBundle.getString("a");

        unBundle.putInt("edadEdu",26);
        Integer edadEdu = unBundle.getInt("edadEdu");

    }


}
