import java.util.Scanner;

public class CentimetriUMetre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi koliko je restojanje izmefju kancelarija u centimetrima: ");
		int N = sc.nextInt();
		
		int rastojanje = N/100;
		
		System.out.print("Rastojanje u cijelim metrima je: " + rastojanje);

		sc.close();
	}

}
