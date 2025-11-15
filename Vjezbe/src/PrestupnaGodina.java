import java.util.Scanner;

public class PrestupnaGodina {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi godinu koju hoces da provjeris je li prestupna: ");
		int godina = sc.nextInt();
		
		boolean prestupna = false; 
		
		if (godina % 400 == 0 ) {
			prestupna = true;
		}
		else if (godina % 100 == 0) {
			prestupna = false;
		}
		else if (godina % 4 == 0) {
			prestupna = true;
			
		}
		
		if (prestupna) {
			System.out.print("Godina je prestupna.");
		} else {
			System.out.print("Godina nije prestupna.");
			
		sc.close();
			
		}
	}

}
