import java.util.Scanner;

public class TaxiPrevoz {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		final double cijenaPoKilometru = 0.5;
		final double pocetnaCijena = 1;
		
		System.out.println("Unesi predjenu kilometrazu taksija: ");
		double km = sc.nextDouble();
		
		double ukupnaCijena = pocetnaCijena + (cijenaPoKilometru * km);
		
		System.out.printf("Ukupna cijena za voznju je bila %.2f", ukupnaCijena);
		
		sc.close();
		
		

	}

}
