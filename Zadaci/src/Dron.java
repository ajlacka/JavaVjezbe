import java.util.Scanner;

public class Dron {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi koordinate drona na x-osi; ");
		double x = sc.nextDouble();
		System.out.println("Unesi koordinate drona na y-osi; ");
		double y = sc.nextDouble();

		System.out.println("Unesi broj paketica: ");
		int N = sc.nextInt();
		
		double ukupnaUdaljenost = 0;
		
		for(int i = 1; N >= i; i++) {
		System.out.print("Unesi koordinate paketica " + i + "(xi yi): ");
		double xi = sc.nextDouble();
		double yi = sc.nextDouble();
		
		if (xi > 0 && yi > 0) {
			double xd = xi - x;
			double yd = yi - y;
			
		double udaljenost = Math.sqrt(xd * xd + yd * yd);
		
		ukupnaUdaljenost += udaljenost;
		   }
		 }
		System.out.println("Ukupna udaljenost do paketa u prvom paketu je: " + ukupnaUdaljenost);
		
		sc.close();
	}
}
