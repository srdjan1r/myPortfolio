package zad2;

import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

		// IZRACUN OCJENE
        
        System.out.println("Unesite bodove koje je student ostvario: ");

        System.out.println("Unesite bodove za prisutnost: ");
        double prisutnost = s.nextDouble();

        System.out.println("Unesite bodove za K1: ");
        double kolokvijum1 = s.nextDouble();

        System.out.println("Unesite bodove za K2: ");
        double kolokvijum2 = s.nextDouble();

        System.out.println("Unesite bodove za zavrsni ispit: ");
        double zavrsniIspit = s.nextDouble();

        double ukupniBodovi = prisutnost + kolokvijum1 + kolokvijum2 + zavrsniIspit;

        int ocjena;

        if (ukupniBodovi >= 91) {
            ocjena = 10;
        } else if (ukupniBodovi >= 81) {
            ocjena = 9;
        } else if (ukupniBodovi >= 71) {
            ocjena = 8;
        } else if (ukupniBodovi >= 61) {
            ocjena = 7;
        } else if (ukupniBodovi >= 51) {
            ocjena = 6;
        } else {
            ocjena = 5;
        }
        System.out.println("Ukupan broj bodova je " + ukupniBodovi
                + " i ocjena: " + ocjena);
        
    }

}