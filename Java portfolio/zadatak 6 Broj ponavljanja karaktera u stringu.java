package zad6;

import java.util.Scanner;

public class Zad6 {

    public static void main(String[] args) {
		
		//Izracun broja pojavljivanja karaktera u stringu
		
        Scanner tastatura = new Scanner(System.in);
        
        System.out.println("String: ");
        String tekst = tastatura.nextLine();
        
        System.out.println("Karakter: ");
        char karakter = tastatura.next().charAt(0);
        
        int brPojavljivanjaKaraktera = 0;
        for(int i = 0; i < tekst.length(); i++) {
            if(tekst.charAt(i) == karakter) {
                brPojavljivanjaKaraktera++;
            }
        }
        
        System.out.println("Broj pojavljivanja karaktera " + karakter + " u stringu " + tekst + " je " + brPojavljivanjaKaraktera);
        
    }
    
}
