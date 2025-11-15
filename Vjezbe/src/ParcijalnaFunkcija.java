import java.util.Scanner;

public class ParcijalnaFunkcija {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi vrijednost x: ");
		double x = sc.nextDouble();
		
		double y;
		
		if (x <= -7) {

			y = -2 * x + 7.0 / 2.0;

        } else if (x > -7 && x < 1) {

        	double brojilac = x * x - 3 * x + 5;
            double imenilac = x * x + 2;
            y = brojilac / imenilac;

        } else if (x >= 1 && x <= 8) {

        	double unutraA = x * x + 2 * x + 2;
            double izraz = (3.0 / 2.0) * x - 4.0 / 7.0;
            double unutraB = Math.sqrt(Math.abs(izraz));
            y = Math.sqrt(unutraA + unutraB);

        } else { 

        	double imenilac = x * x - 11 * x;

            if (imenilac == 0) {
                System.out.println("Izraz nije definisan (dijeljenje sa nulom).");
                sc.close();
                return;
            }

            y = Math.abs(3.0 / imenilac);
        }

        System.out.println("Vrijednost y je: " + y);

        sc.close();
    }
}