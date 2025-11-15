import java.util.Scanner;

public class KatapultiDvorac {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi broj katapulta N: ");
        int N = sc.nextInt();

        System.out.print("Unesi maksimalno dozvoljeno Manhattan rastojanje D: ");
        int D = sc.nextInt();

        System.out.print("Unesi health dvorca HD: ");
        int HD = sc.nextInt();

        System.out.print("Unesi napad jednog katapulta KA: ");
        int KA = sc.nextInt();

        int prijetnje = 0;

        for (int i = 1; i <= N; i++) {
            System.out.println("Unesi koordinate katapulta " + i + ":");
            int x = sc.nextInt();
            int y = sc.nextInt();

            int manhattan = Math.abs(x) + Math.abs(y);

            if (manhattan <= D) {
                prijetnje++;
            }
        }

        System.out.println("Broj katapulta koji predstavljaju prijetnju: " + prijetnje);

        int ukupnaSteta = prijetnje * KA;

        if (ukupnaSteta >= HD) {
            System.out.println("Katapulti mogu srusiti dvorac.");
        } else {
            System.out.println("Katapulti NE mogu srusiti dvorac.");
        }

        sc.close();
    }
}