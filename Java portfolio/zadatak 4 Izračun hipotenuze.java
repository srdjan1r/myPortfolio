package zad4;

import java.util.Scanner;

public class zad4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		
		// IZRACUN HIPOTENUZE
        
        System.out.println("Unesite vrijednost za a i b: ");
        
        double a = s.nextDouble();
        double b = s.nextDouble();
        
        // c^2 = a^2 + b^2 FORMULA
        
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("Hipotenuza je " + c);
        
    }

}