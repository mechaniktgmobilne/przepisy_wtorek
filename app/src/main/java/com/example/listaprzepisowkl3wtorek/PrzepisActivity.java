package com.example.listaprzepisowkl3wtorek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PrzepisActivity extends AppCompatActivity {
TextView textViewNazwaPrzepisu, textViewSkladniki, textViewOpis;
ImageView imagaView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_przepis);
        int idPrzepisuDoWyswietlenia = getIntent().getIntExtra("ID",1);
        Toast.makeText(this, ""+idPrzepisuDoWyswietlenia, Toast.LENGTH_SHORT).show();
        Przepis przepis = RepozytoriumPrzepisow.zwrocPrzepisoId(idPrzepisuDoWyswietlenia);
        Toast.makeText(this, ""+przepis.getNazwaPrzepisu(), Toast.LENGTH_SHORT).show();
        textViewNazwaPrzepisu = findViewById(R.id.textView2);
        textViewSkladniki = findViewById(R.id.textViewSkladniki);
        textViewOpis = findViewById(R.id.textViewOpis);
        wyswietlPrzepis(przepis);
    }

    private void wyswietlPrzepis(Przepis przepis){
        textViewNazwaPrzepisu.setText(przepis.getNazwaPrzepisu());
    }
}