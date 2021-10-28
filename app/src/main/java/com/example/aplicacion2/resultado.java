package com.example.aplicacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class resultado extends AppCompatActivity {
    EditText nombre,edad,apellido,correo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_resultado );
        nombre =(EditText)findViewById ( R.id.nombre );
        apellido =(EditText)findViewById ( R.id.apellido );
        correo =(EditText)findViewById ( R.id.txtcorreo );
        edad =(EditText)findViewById ( R.id.txtedad);
        String nom=getIntent ().getStringExtra ( "nombre" );
        String ape=getIntent ().getStringExtra ( "apellido" );
        String cor=getIntent ().getStringExtra ( "Correo" );
        String eda=getIntent ().getStringExtra ( "Edad" );
        nombre.setText(nom);
        apellido.setText (ape);
        correo.setText ( cor);
        edad.setText ( eda);
    }
}