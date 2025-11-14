import java.util.Scanner;

public class ProvjeraCijelogBroja {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi cijeli broj:");
		int broj = sc.nextInt();
		
		if (broj % 2 == 0 ) {
		         System.out.println("Broj je paran.");
		}else {
		    	 System.out.println("Broj je neparan,");
		    }
		if (broj>=0) {
		         System.out.println("Broj je pozitivan.");
		} else {
		    	 System.out.println("Broj je negativa.");
		        	 
		         }
		         
		sc.close();

	}

}
