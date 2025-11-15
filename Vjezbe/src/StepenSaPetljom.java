import java.util.Scanner;

public class StepenSaPetljom {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi broj koji hoces da stepenujes: ");
		int x = sc.nextInt();
		
		System.out.print("Unesi stepen: ");
		int n = sc.nextInt();
		
		int rezultat = 1;
		int brojac = 0;
		
		
		while (n > brojac) {
			rezultat *= x;
			brojac++;
			}
		System.out.print("Rezultat nakon stepenovanja je: " + rezultat);
		
		sc.close();
		}
	
	}


