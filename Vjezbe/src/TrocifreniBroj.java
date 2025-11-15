import java.util.Scanner;

public class TrocifreniBroj {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Unesi trocifreni broj: ");
        int broj = sc.nextInt();
        
        if (broj < 100 || broj > 999) {
            System.out.println("Greska: broj mora biti trocifren!");
            sc.close();
            return;
        }
        
        int c3 = broj % 10;          // posljednja cifra
        int c2 = (broj / 10) % 10;   // srednja cifra
        int c1 = broj / 100;         // prva cifra
        
        int noviBroj = c3 * 100 + c2 * 10 + c1;
        
        System.out.println("Broj koji dobijamo nakon zamjene prve i posljednje cifre je: " + noviBroj);
        
        sc.close();
    }
}