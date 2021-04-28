package com.company;

import modeli.Korisnik;
import modeli.Model;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        Korisnik korisnik = new Korisnik("jova3",
//                "pass",
//                "Jova jovic",
//                "jova.jovic3@gmail.com");
//        System.out.println(korisnik);
//        korisnik = (Korisnik)korisnik.save();
//        System.out.println(korisnik);
//
//        Korisnik korisnik2 = new Korisnik("mika",
//                "drugi",
//                "Mika Mikic",
//                "mika.mikic@gmail.com");
//        korisnik2 = (Korisnik)korisnik2.save();
//        System.out.println(korisnik2);

        Korisnik korisnik3 = new Korisnik();
        korisnik3 = (Korisnik)korisnik3.find(7);
        System.out.println(korisnik3);
//        System.out.println(korisnik3);
//// Azuriranje (izmena)
////        korisnik3.setPassword("pass3");
////        korisnik3.save();
//        korisnik3.delete();
//
//        ArrayList<Model> korisnici = Korisnik.all(Korisnik.class);
//        System.out.println("Svi korisnici:");
//        for (Model korisnik: korisnici) {
//            System.out.println(((Korisnik)korisnik).getEmail());
//        }
    }
}
