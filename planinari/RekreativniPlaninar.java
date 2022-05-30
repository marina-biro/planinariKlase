package com.planinari;

public class RekreativniPlaninar extends Planinar {

    public int tezinaOpreme;
    public String nazivOkruga;
    public int maxUsponBezOpreme;
    public double clanarina;

    public RekreativniPlaninar() {
    }

    public RekreativniPlaninar(int licniBroj, String ime, String prezime, int tezinaOpreme, String nazivOkruga, int maxUsponBezOpreme) {
        super(licniBroj, ime, prezime);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maxUsponBezOpreme = maxUsponBezOpreme;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(int tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    public String getNazivOkruga() {
        return nazivOkruga;
    }

    public void setNazivOkruga(String nazivOkruga) {
        this.nazivOkruga = nazivOkruga;
    }

    public int getMaxUsponBezOpreme() {
        return maxUsponBezOpreme;
    }

    public void setMaxUsponBezOpreme(int maxUsponBezOpreme) {
        this.maxUsponBezOpreme = maxUsponBezOpreme;
    }

@Override
    public  void stampaj() {
        System.out.println("Rekreativac, id: " + getLicniBroj());
        System.out.println("ime: " + getIme() + " " + getPrezime() + " Okrug: " + nazivOkruga );
    }

    public  double clanarina() {
        clanarina = 1000.00;
        return  clanarina;
    }

    public  boolean uspesanUspon(Planina planina){

       return  planina.getVisinaPlanine() < maxUsponBezOpreme + (tezinaOpreme * 50);

    }
}
