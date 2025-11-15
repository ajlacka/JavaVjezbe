import java.util.Scanner;

public class KojemKvadratuPripada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
			System.out.print("Unesi koordinate x: ");
			double x = sc.nextDouble();
			
			System.out.print("Unesi koordinate y: ");
			double y = sc.nextDouble();
			
			if (x > 0 && y > 0) {
				System.out.print("Koordinate se nalaze u prvom kvadrantu");
			} else if (x < 0 && y > 0) {
				System.out.print("Koordinate se nalaze u drugom kvadrantu");
			} else if ( x < 0 && y < 0) {
				System.out.print("Koordinate se nalaze u trecem kvadrantu");
			} else if (x > 0 && y < 0) {
				System.out.print("Koordinate se nalaze u cetvrtom kvadrantu");
			} else {
				System.out.print("Koordinate su u centru koordinantne ose");
			}

			sc.close();
			
	}

}
