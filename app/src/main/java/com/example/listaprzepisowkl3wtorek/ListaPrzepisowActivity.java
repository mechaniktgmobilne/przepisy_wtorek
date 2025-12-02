package com.example.listaprzepisowkl3wtorek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class ListaPrzepisowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_przepisow);
        String kategoriaPrzepisu = getIntent()
                .getStringExtra("KATEGORIA");
        Toast.makeText(this, kategoriaPrzepisu,
                Toast.LENGTH_SHORT).show();
    }
}