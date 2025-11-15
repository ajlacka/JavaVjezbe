import java.util.Scanner;

public class PetocifreniBroj {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi neki petocifreni broj: ");
		int n = sc.nextInt();
		
		if (99999 < n || 10000 > n) {
			System.out.print("Greska broj koji ste unijeli nija petocifren!");
			sc.close();
			return;
		}
		
		int c1 = n % 10;
		int c2 = (n / 10) % 10;
		
		int zbir = c1 + c2;
		
		System.out.print("Sprat stambene zgrade je " + zbir + ".");
		
		sc.close();
		
	}

}
