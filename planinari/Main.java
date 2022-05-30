package com.planinari;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Planina Zlatibor = new Planina("Zlatibor" , "Srbija", 13400);
        ArrayList<Planinar> planinari = new ArrayList<>();
        planinari.add(new Alpinista(4567989,"Janko", "Jankovic", 60));
        planinari.add(new Alpinista(6528415,"Mirko", "Jankovic", 30));
        planinari.add(new Alpinista(7892465,"Ana", "Jankovic", 55));

        planinari.add(new RekreativniPlaninar(465143, "Pera", "Perovic", 56,"Raska", 3000 ));
        planinari.add(new RekreativniPlaninar(78955, "Sanja", "Perovic", 60,"Raska", 2000 ));
        planinari.add(new RekreativniPlaninar(1795842, "Jelena", "Perovic", 13,"Raska", 25000 ));

        int sumaClanarina = 0;
        for(int i=0; i<planinari.size(); i++){
            planinari.get(i).stampaj();

            //planinari.get(i).clanarina();
            sumaClanarina+=planinari.get(i).clanarina();

            System.out.println("Uspon je bio uspesan? " + planinari.get(i).uspesanUspon(Zlatibor));
            System.out.println();
        }
        System.out.println("Suma clanarina je " + sumaClanarina);
    }


}
