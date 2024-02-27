package tablica_mnozenja;

public class Tablica_mnozenja {

    public static void main(String[] args) {
        
        // Generisanje i prikaz tablice množenja
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }  
    
}