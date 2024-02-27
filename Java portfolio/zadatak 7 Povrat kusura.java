package kusur;

import java.util.*;

public class Kusur {

    public static void main(String[] args) {
        
		// Povrat kusura
		
        int iznos; // iznos za usitnjavanje
        int n25, n10, n5, n1; // broj novcica usitnjenog iznosa
        
        // Unos preko tastature
        Scanner tastatura = new Scanner(System.in);
        
        // Novcani iznos za usitnjavanje
        System.out.println("Unesite iznos za usitnjavanje: ");
        iznos = tastatura.nextInt();
        
        n25 = iznos / 25;
        iznos = iznos % 25;
        
        n10 = iznos / 10;
        iznos = iznos % 10;
        
        n5 = iznos / 5;
        n1 = iznos % 5;
        
        System.out.print("Minimalni broj novcica za ");
        System.out.println("dati iznos je: ");
        System.out.println(n25 + " novcica vrednost 25");
        System.out.println(n10 + " novcica vrednosti 10");
        System.out.println(n5 + " novcica vrednosti 5");
        System.out.println(n1 + " novcica vrednosti 1");
        
    }
    
}