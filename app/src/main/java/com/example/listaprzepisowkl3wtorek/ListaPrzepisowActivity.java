package com.example.listaprzepisowkl3wtorek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListaPrzepisowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_przepisow);
        String kategoriaPrzepisu = getIntent()
                .getStringExtra("KATEGORIA");
        Toast.makeText(this, kategoriaPrzepisu,
                Toast.LENGTH_SHORT).show();
        //TODO :zrobić poniższe jeszcze raz
        ArrayList<Przepis> przepisy
                = RepozytoriumPrzepisow.getPrzepisy();
        //TODO: wyswietlic tylko przpisy z tej kategorii
        ListView listView = findViewById(R.id.listViewListaPrzepisow);
        ArrayAdapter<Przepis> arrayAdapter = new ArrayAdapter<>(
                ListaPrzepisowActivity.this,
                android.R.layout.simple_list_item_1,
                przepisy
        );
        listView.setAdapter(arrayAdapter);
    }
}