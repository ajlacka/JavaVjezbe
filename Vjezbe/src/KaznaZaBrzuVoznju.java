import java.util.Scanner;

public class KaznaZaBrzuVoznju {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi broj automobila: ");
		int n = sc.nextInt();
		
		int ukupnaKazna = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Kolika je brzina auta br " + i + ":");
			int brzina = sc.nextInt();
		
		if (brzina > 50) {
			int prekoracenje = brzina - 50;
			int kazna = prekoracenje * 10;
			ukupnaKazna += kazna;
		}
	}
			System.out.print("Ukupna kazna za ove automobile koji su vozili prebrzo je " + ukupnaKazna +".");
			sc.close();
			
		}
}
			
			
			
				
			
		
		
		

