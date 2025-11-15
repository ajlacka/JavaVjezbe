import java.util.Scanner;

public class IgraKruznaStaza {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi broj polja N: ");
        int N = sc.nextInt();

        System.out.print("Unesi broj poteza T: ");
        int T = sc.nextInt();

        int poz = 0;

        for (int i = 1; i <= T; i++) {
            System.out.print("Unesi potez K za potez " + i + ": ");
            int K = sc.nextInt();
            poz = (poz + K) % N;
            System.out.println("Igrac je na polju: " + poz);
        }

        System.out.println("Konacna pozicija igraca je: " + poz);

        sc.close();
    }
}