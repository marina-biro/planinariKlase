package com.planinari;

public abstract class Planinar {

    private int licniBroj;
    private String ime;
    private String prezime;

    public Planinar() {
    }

    public Planinar(int licniBroj, String ime, String prezime) {
        this.licniBroj = licniBroj;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getLicniBroj() {
        return licniBroj;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

   public abstract void stampaj();

   public abstract double clanarina();

   public abstract boolean uspesanUspon(Planina planina);


}
