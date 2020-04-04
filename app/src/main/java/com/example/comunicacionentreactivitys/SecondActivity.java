package com.example.comunicacionentreactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    public static final String KEY_BUNDLE_SALUDO = "saludo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //¿Quien tiene el bundle? Lo tiene el intent
        //¿Quien tiene el intent?
        Intent intentRecibido = getIntent();

        Bundle unBundleRecibido = intentRecibido.getExtras();

        String saludo = unBundleRecibido.getString(SecondActivity.KEY_BUNDLE_SALUDO);


        Toast.makeText(this, saludo, Toast.LENGTH_SHORT).show();
    }
}
