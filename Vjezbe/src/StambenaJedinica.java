import java.util.Scanner;

public class StambenaJedinica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi cetverocifreni broj: ");
		int broj = sc.nextInt();
		
		int sprat = (broj/10) % 10;
		
		System.out.print("Sprat stambene jedinice je " + sprat + ".");
		
		sc.close();
		

	}

}
