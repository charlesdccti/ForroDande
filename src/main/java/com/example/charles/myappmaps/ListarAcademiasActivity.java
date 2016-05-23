package com.example.charles.myappmaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.charles.myappmaps.Controle.Controle;
import com.example.charles.myappmaps.model.Academia;
import com.example.charles.myappmaps.services.DB;

import java.util.ArrayList;

public class ListarAcademiasActivity extends AppCompatActivity {

    Controle controle = new Controle();
    protected ArrayAdapter<Academia> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_academias);


        // listAcademia= DB.getInstance(this).getAllAcademias();// Pegando lista de academias no banco SQL

        ArrayList<Academia> listAcademia = (ArrayList<Academia>)new ArrayList( controle.listaAcademias(this));//chamando metodo para listar academias

        int layout = android.R.layout.simple_list_item_1;//Layout
        adapter= new ArrayAdapter<>(this,layout,listAcademia); ///Intanciando adapter com lista
        ListView lista = (ListView)findViewById(R.id.lbList);//pegando listiView da tela

        lista.setAdapter(adapter);//setando adapter na tela



        Button btVoltar = (Button) findViewById(R.id.btVoltar);
        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Navega  para proxima tela
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
