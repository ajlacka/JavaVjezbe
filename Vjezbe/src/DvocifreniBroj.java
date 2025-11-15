import java.util.Scanner;

public class DvocifreniBroj {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi dvocifreni broj: ");
		int n = sc.nextInt();
		
		if (n < 10 || n > 99) {
			System.out.print("Greska, broj mora biti dvocifreni!");
			sc.close();
			return;
		}
		
		int c1 = n / 10;
		int c2 = n % 10;
		
		int rezultat = 0;
		
		if (c1 > c2) {
            if (c2 == 0) {
                System.out.println("Dijeljenje sa nulom nije moguce!");
                sc.close();
                return;
            }
            rezultat = c1 / c2;
        } 
        else if (c1 < c2) {
            rezultat = c1 + c2;
        } 
        else { 
            rezultat = c1 * c2;
        }
		
		System.out.print("Kad se cifre obrade dobijamo " + rezultat);
		
		sc.close();
		
		}
	}


