package com.planinari;

public class Alpinista extends Planinar {
    public int brojPoena;
    public double clanarina;

    public Alpinista() {
    }

    public Alpinista(int licniBroj, String ime, String prezime, int brojPoena) {
        super(licniBroj, ime, prezime);
        this.brojPoena = brojPoena;
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        this.brojPoena = brojPoena;
    }


    @Override
    public  void stampaj() {
        System.out.println("Alpinista, id: " + getLicniBroj());
        System.out.println("ime " + getIme() + " " + getPrezime() );
        System.out.println("Broj poena: " + brojPoena);
    }

@Override
    public double clanarina(){
        clanarina = 1500.00 - (50.00 * brojPoena);
        if ( clanarina < 0) {
            return 0;
        }
        return clanarina;
    }

    public boolean uspesanUspon(Planina planina) {
    return planina.getVisinaPlanine() < 4000;
    }


}
