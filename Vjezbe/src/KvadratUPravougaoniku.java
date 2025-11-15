import java.util.Scanner;

public class KvadratUPravougaoniku {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//stranica a pravougaonika je istaa kao stranica a kvadrata
		System.out.print("Unesi stranicu a pravougaonika: ");
		double a = sc.nextDouble();
		
		
		System.out.print("Unesi stranicu b pravougaonika: ");
		double b = sc.nextDouble();
		
		if(b >= 2*a) {
			System.out.print("Moguce je da stane kvadrat.");
		} else {
			System.out.print("Nije moguce da stane kvadrat.");
		}
		
		sc.close();
		
	}

}
