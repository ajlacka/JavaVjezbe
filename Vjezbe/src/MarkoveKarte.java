import java.util.Scanner;

public class MarkoveKarte {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi broj karata: ");
		int n = sc.nextInt();
		
		boolean naisliNaNeparni = false;  
        boolean pravilno = true;

        for (int i = 1; i <= n; i++) {
            System.out.print("Unesi kartu " + i + ": ");
            int karta = sc.nextInt();

            if (!naisliNaNeparni) {
                if (karta % 2 != 0) {
                    naisliNaNeparni = true;  
                }
            } else {
                if (karta % 2 == 0) {
                    pravilno = false;       // ako naidjemo na parnu poslije neparnw d
                }
            }
        }

        if (pravilno) {
            System.out.println("Marko je ispravno slozio karte.");
        } else {
            System.out.println("Marko NIJE ispravno slozio karte.");
        }

        sc.close();
    }
}

	


