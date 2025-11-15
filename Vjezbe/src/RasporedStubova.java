import java.util.Scanner;

public class RasporedStubova {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Unesi duzinu terase u metrima (d): ");
	        double d = sc.nextDouble();

	        System.out.print("Unesi broj stubica (n): ");
	        int n = sc.nextInt();

	        System.out.print("Unesi sirinu stubica u centimetrima (s): ");
	        double s = sc.nextDouble();

	        // Racunanje rastojanja r (u cm)
	        double r = (d * 100 - n * s) / (n + 1);

	        System.out.printf("Rastojanje izmedju stubica je: %.2f cm%n", r);

	        sc.close();
	    }
	

	}


