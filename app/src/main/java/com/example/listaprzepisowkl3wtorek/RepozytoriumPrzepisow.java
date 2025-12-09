package com.example.listaprzepisowkl3wtorek;

import java.security.PublicKey;
import java.util.ArrayList;

public class RepozytoriumPrzepisow {
    private static ArrayList<Przepis> przepisy;
    private static void generujPrzepisy(){
        przepisy = new ArrayList<>();
        przepisy.add(new Przepis("Pierniczki","ciasteczka",
                R.drawable.pierniczki,
                "mąka, kakao, przyprawy, miód",
                "wszystko wymieszać",1));
        przepisy.add(new Przepis("Muffinki","ciasteczka",
                R.drawable.muffinka,"mąka, mleko, kakao",
                "wszystko wymieszać, upiec",2));

        przepisy.add(new Przepis("Sernik na zimno", "ciasta",
                R.drawable.sernik,"ser biały, galaretka,woda",
                "wymieszaj i do lodówki",3));
        przepisy.add(new Przepis("Herbata zimowa",
                "napoje",R.drawable.herbata_zimowa,
                "herbata, rozmaryn, gożdziki,jabłko, pomarańcza,imbir",
                "wszystko zalać wrzątkiem i poczekać",4));

    }

    public static ArrayList<Przepis> getPrzepisy(){
        generujPrzepisy();
        return przepisy;
    }

    public static Przepis zwrocPrzepisoId(int id){
        generujPrzepisy();
        for (Przepis przepis:przepisy) {
            if(przepis.getIdPrzepisu() == id){
                return przepis;
            }
        }
        return przepisy.get(0);
    }

    public static ArrayList<Przepis> zwrocPrzepisyZKategorii(String kategoria){
        ArrayList<Przepis> przepisyZKategorii =new ArrayList<>();
        generujPrzepisy();
        for (Przepis przepis:przepisy) {
            if(przepis.getKategoria().equals(kategoria)){
                przepisyZKategorii.add(przepis);
            }
        }
        return przepisyZKategorii;
    }
}
