package com.example.izquierdo.banco;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MyActivity extends Activity implements View.OnClickListener {
    private Button botonPasta;
    private Button botonArroz;
    private Button botonGalletas;
    private Button botonLegumbres;
    int contadorPasta =0;
    int contadorArroz=0;
    int contadorLegumbres=0;
    int contadorGalletas=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        botonPasta = (Button) findViewById(R.id.buttonPasta);
        botonArroz = (Button) findViewById(R.id.buttonArroz);
        botonGalletas = (Button) findViewById(R.id.buttonGalletas);
        botonLegumbres=(Button) findViewById(R.id.buttonLegumbres);

        botonPasta.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {

                Toast.makeText(
                        botonPasta.getContext()
                        ,  "Y van " + ++contadorPasta + " pastas."
                        , Toast.LENGTH_SHORT)
                        .show();
            }
        });

        botonArroz.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                Toast.makeText(
                        botonArroz.getContext()
                        ,  "Y van " + ++contadorArroz + " arroces."
                        , Toast.LENGTH_SHORT)
                        .show();
            }
        });

        botonGalletas.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                Toast.makeText(
                        botonGalletas.getContext()
                        ,  "Y van " + ++contadorGalletas + " Galletas."
                        , Toast.LENGTH_SHORT)
                        .show();
            }
        });


        botonLegumbres.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                Toast.makeText(
                        botonLegumbres.getContext()
                        ,  "Y van " + ++contadorLegumbres + " Legumbres."
                        , Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

    }
}