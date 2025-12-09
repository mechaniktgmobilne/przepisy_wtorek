package com.example.listaprzepisowkl3wtorek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
                = RepozytoriumPrzepisow.zwrocPrzepisyZKategorii(kategoriaPrzepisu);
        //TODO: wyswietlic tylko przpisy z tej kategorii
        ListView listView = findViewById(R.id.listViewListaPrzepisow);
        ArrayAdapter<Przepis> arrayAdapter = new ArrayAdapter<>(
                ListaPrzepisowActivity.this,
                android.R.layout.simple_list_item_1,
                przepisy
        );
        listView.setAdapter(arrayAdapter);
        /*
        1. dane -> tu ArrayList przepisy
        2. listView -> zadeklarować i znaleźć po id
        3. Array Adapter
            - context aplikacji - this
            - widok na pojedynczy element -> tu android.R.layout. simple....
            - lista z danymi
        4. przypisać ArrayAdapter do ListView
         */

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Przepis przepis = przepisy.get(i);
                        Intent intent = new Intent(ListaPrzepisowActivity.this, PrzepisActivity.class);
                        int idTegoPrzepisu = przepis.getIdPrzepisu();
                        intent.putExtra("ID",idTegoPrzepisu);
                        //Toast.makeText(ListaPrzepisowActivity.this, przepis.getNazwaPrzepisu(), Toast.LENGTH_SHORT).show();
                        startActivity(intent);
                    }
                }
        );
    }
}