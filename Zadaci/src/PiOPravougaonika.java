import java.util.Scanner;

public class PiOPravougaonika {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite duzinu stranice a: ");
		double a = sc.nextDouble();
		
		System.out.print("Unesite duzinu stranice b: ");
		double b = sc.nextDouble();
		
		double povrsina = a * b;
		double obim = 2 * (a + b);

		System.out.println("Površina pravougaonika: " + povrsina);
		System.out.println("Obim pravougaonika: " + obim);

		sc.close();
	}

}
