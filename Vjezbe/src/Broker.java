import java.util.Scanner;

public class Broker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi sa koliko novca raspolaze Broker: ");
		double n = sc.nextDouble();
		
		System.out.print("Unesi cijecu akcija: ");
		double x = sc.nextDouble();
		
		double skokcijene = x * 1.15;
		
		double promjena = Math.round( n / skokcijene);
		
		if (promjena > 0) {
			System.out.print("Broker moze kupiti " + promjena + " akcija.");
		} else {
			System.out.print("Broker ne moze priustiti ni jednu akciju.");
		}
		
		sc.close();
	}

}
