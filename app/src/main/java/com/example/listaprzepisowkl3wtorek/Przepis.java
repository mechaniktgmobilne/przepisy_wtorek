package com.example.listaprzepisowkl3wtorek;
public class Przepis {
    private String nazwaPrzepisu;
    private String kategoria;
    private int idObrazka;
    private String skladniki;
    private String opis;

    public Przepis(String nazwaPrzepisu) {
        this.nazwaPrzepisu = nazwaPrzepisu;
        kategoria = "ciasta";
        idObrazka = R.drawable.sernik;
        skladniki = "";
        opis = "";
    }

    public Przepis(String nazwaPrzepisu, String kategoria, int idObrazka, String skladniki, String opis) {
        this.nazwaPrzepisu = nazwaPrzepisu;
        this.kategoria = kategoria;
        this.idObrazka = idObrazka;
        this.skladniki = skladniki;
        this.opis = opis;
    }
    //TODO: przemyśleć czy są potrzebne settery

    @Override
    public String toString() {
        return nazwaPrzepisu ;
    }

    public String getNazwaPrzepisu() {
        return nazwaPrzepisu;
    }

    public void setNazwaPrzepisu(String nazwaPrzepisu) {
        this.nazwaPrzepisu = nazwaPrzepisu;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public void setIdObrazka(int idObrazka) {
        this.idObrazka = idObrazka;
    }

    public String getSkladniki() {
        return skladniki;
    }

    public void setSkladniki(String skladniki) {
        this.skladniki = skladniki;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
