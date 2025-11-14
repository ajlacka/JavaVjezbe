import java.util.Scanner;

public class PovrsinaPoKoordinatama {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesite koordinate prve tacke (x1,y1): ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		System.out.println("Unesite koordinate druge tacke (x2,y2): ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		double sirina = Math.abs(x1-x2); // Math.abs vraca apsolutnu vrednost
		double visina = Math.abs(y1-y2);
		
		double povrsina = sirina * visina;
		System.out.printf("Povrsina pravougaonika je %.2f", povrsina);
		
		sc.close();
		
		

	}

}
