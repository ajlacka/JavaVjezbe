import java.util.Scanner;

public class PorezNaPlatu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi broj plata: ");
		int n = sc.nextInt();
		
		double sumaPoreza = 0;
		
		for (int i = 1; n >= i; i++ ) {
			System.out.print("Unesi platu zaposlenog br " + i + ":");
			double plate = sc.nextDouble();
			
		if (plate <= 1000) {
			double sum1 = plate * 0.1;
			sumaPoreza += sum1;	
		} else {
			double sum2 = plate * 0.2;
			sumaPoreza += sum2;
		 }
	}
		
		System.out.print("Ukupan porez koji treba da plati firma je " + sumaPoreza + ".");
		sc.close();
	}

}
