import java.util.Scanner;

public class StanjeVode {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi trenutnu tempersturu: ");
		double temperatura = sc.nextDouble();
		
		if (temperatura >= 0 && temperatura <= 100) {
			System.out.print("Voda je u tecnom stanju.");
		} else if (temperatura < 0) {
			System.out.print("Voda je u cvrstom stanju.");
		} else {
			System.out.print("Voda je u gasovitom stanju.");
		}
		sc.close();
	}

}
