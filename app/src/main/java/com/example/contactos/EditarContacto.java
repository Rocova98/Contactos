package com.example.contactos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class EditarContacto extends AppCompatActivity {

    private EditText telefono;
    private EditText correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_contacto);

        Bundle extras = getIntent().getExtras();
        String Telefono = extras.getString("Telefono");
        String Correo = extras.getString("Correo");

        telefono = findViewById(R.id.edtTelefono);
        correo = findViewById(R.id.edt2Correo);

        telefono.setText(Telefono);
        correo.setText(Correo);
    }
}
