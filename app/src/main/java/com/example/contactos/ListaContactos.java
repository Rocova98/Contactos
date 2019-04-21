package com.example.contactos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ListaContactos extends AppCompatActivity {
    ArrayList<Contacto> contactos;
    RecyclerView listaContactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_contactos);
        listaContactos = findViewById(R.id.listaC);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaContactos.setLayoutManager(llm);
        IniciarAdaptador();
        IniciarListaContactos();
    }

    public void IniciarAdaptador(){
        ContactoAdaptador adaptador = new ContactoAdaptador(contactos,this);
        listaContactos.setAdapter(adaptador);
    }

    public void IniciarListaContactos()
    {
        contactos = new ArrayList<>();
        contactos.add(new Contacto("55 11 22 13 ","ja@gmail.com",R.drawable.adriana));
        contactos.add(new Contacto("55 25 11 07 79 ","ka@gmail.com",R.drawable.karla));
        contactos.add(new Contacto("55 10 22 14 ","a@gmail.com",R.drawable.luisa));
    }
}
