import java.util.Scanner;

public class NegativnaTemperaturaDan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi broj dana: ");
		int n = sc.nextInt();
		
		// ako ostane -1 onda znamo da nije bilo negativnih temparatura
		int poslednjiNegativan = -1;
		
		for (int i = 1; n>= i; i++) {
			System.out.print("Unesi temperaturu br " + i + ":");
			double t = sc.nextDouble();
			
			if ( t < 0) {
				poslednjiNegativan = i;
				
			}
		}
		if (poslednjiNegativan == -1) {
			System.out.print("Nije bilo negativne temoerature.");
		} else {
			System.out.print("Poslednji dan sa negaticnom temperaturom je bio dan br. " + poslednjiNegativan);
		}
		sc.close();
	}

}
