import java.util.Scanner;

public class ParkingNaplata {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Unesi broj automobila na parkingu: ");
        int n = sc.nextInt();

        double ukupno = 0;

        for(int i = 1; i <= n; i++) {   
            System.out.print("Unesi broj sati automobilu br. " + i + ": ");
            int sati = sc.nextInt();

            double cijena;

            if(sati <= 5) {
                cijena = sati * 2;
            } else {
                cijena = 5 * 2 + (sati - 5) * 1;
            }

            ukupno += cijena;  
        }

        System.out.println("Ukupna zarada parkinga je: " + ukupno + "€");

        sc.close();
    }
}