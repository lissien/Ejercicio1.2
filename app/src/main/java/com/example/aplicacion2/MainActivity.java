package com.example.aplicacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edad=(EditText) findViewById(R.id.edad);
        EditText correo= (EditText)findViewById(R.id.correo);
        EditText nombre= (EditText)findViewById(R.id.txtnombre);
        EditText apellido= (EditText)findViewById(R.id.txtapellido);


        Button btn= findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent v2= new Intent(MainActivity.this, resultado.class);
                v2.putExtra("Edad",edad.getText ().toString ());
                v2.putExtra("Correo",correo.getText ().toString ());
                v2.putExtra("nombre",nombre.getText ().toString ());
                v2.putExtra("apellido",apellido.getText ().toString ());
                startActivity(v2);
            }
        });
    }
}