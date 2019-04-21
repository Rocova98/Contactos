package com.example.contactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtCorreo;
    EditText edtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtCorreo = findViewById(R.id.edtCorreo);
        edtPass = findViewById(R.id.edtPass);
    }

    public void OnClickIniciar (View v){
        String correo = edtCorreo.getText().toString();
        String pass = edtPass.getText().toString();

        if (correo.equals("rocovato@hotmail.com") && pass.equals("12345"))
        {
            Intent LISTACONTACTOS = new Intent(MainActivity.this,ListaContactos.class);
            startActivity(LISTACONTACTOS);
        }
        else
        {
            Toast.makeText(MainActivity.this, "Correo o contraseña incorrecta", Toast.LENGTH_SHORT).show();
        }
    }
}
