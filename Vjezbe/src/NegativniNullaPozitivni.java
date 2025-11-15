import java.util.Scanner;

public class NegativniNullaPozitivni {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi broj elemenata: ");
        int n = sc.nextInt();

        boolean vidjenaNula = false;
        boolean vidjenPozitivni = false;

        boolean ispravno = true;

        for (int i = 1; i <= n; i++) {

            System.out.print("Unesi broj " + i + ": ");
            int x = sc.nextInt();

            if (x < 0) {
                // negativan ne sme da dodje posle nula ili pozitivnih
                if (vidjenaNula || vidjenPozitivni) {
                    ispravno = false;
                }
            } 
            else if (x == 0) {
                // nula ne sme posle pozitivnih
                if (vidjenPozitivni) {
                    ispravno = false;
                }
                vidjenaNula = true;
            } 
            else {  // x > 0
                vidjenPozitivni = true;
            }
        }

        if (ispravno) {
            System.out.println("Brojevi su ispravno uredjeni.");
        } else {
            System.out.println("Brojevi NISU ispravno uredjeni.");
        }

        sc.close();
    }
}