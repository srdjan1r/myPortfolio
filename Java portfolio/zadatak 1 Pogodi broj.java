package zad1;

import java.util.Scanner;

public class zad1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // POGODI BROJ
        
        int zamisljeniBroj;
        int pokusaj;
        
        zamisljeniBroj = (int)(100*Math.random()) + 1; //Brojevi 1 - 100
        
        do{
            
            System.out.println("Pokusajte da pogodite zamisljeni broj: ");
            pokusaj = s.nextInt();
            
            if(pokusaj < zamisljeniBroj) {
                System.out.println("Zamislio sam veci broj, pokusaj ponovo!");
            } else if(pokusaj > zamisljeniBroj) {
                System.out.println("Zamislio sam manji broj, pokusaj ponovo!");                      
            } else {
                System.out.println("Bravo! Pogodio si broj.");
            }
        
        }while(pokusaj != zamisljeniBroj);
    }

}