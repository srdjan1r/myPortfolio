package zad5;

import java.util.Scanner;

public class Zad5 {

    public static void main(String[] args) {
        
        //Koji je najmanji broj
        
        Scanner tastatura = new Scanner(System.in);
        
        System.out.println("Prvi broj: ");
        int br1 = tastatura.nextInt();
        
        System.out.println("Drugi broj: ");
        int br2 = tastatura.nextInt();
        
        System.out.println("Treci broj: ");
        int br3 = tastatura.nextInt();
        
        System.out.println("Cetvrti broj: ");
        int br4 = tastatura.nextInt();
        
        int najmanjiBr = Math.min(Math.min(Math.min(br1, br2), br3), br4);
        
        System.out.println("Najmanji od unetih brojeva je: " + najmanjiBr);
        
    }
    
}