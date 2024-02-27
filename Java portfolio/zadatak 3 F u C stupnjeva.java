package zad3;

import java.util.Scanner;

public class zad3 {

    public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
		
		// Farenhajt u Celzijus
		
        System.out.println("Unesite temperaturu u farenhajtima: ");
        double farenhajt = s.nextDouble();
        double celzijus = 5 * (farenhajt - 32) / 9;
        System.out.println("Temperatura " + farenhajt + " je " + celzijus + " stupnjava celzijusevih.");

    }

}