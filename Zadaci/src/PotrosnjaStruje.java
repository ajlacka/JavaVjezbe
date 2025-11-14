import java.util.Scanner;

public class PotrosnjaStruje {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi broj domacinstava: ");
		int N = sc.nextInt();
		
		double ukupno = 0;
		double preko500 = 0;
		
		for (int i = 1; i <= N; i++ ) {
				System.out.print("Unesi potrosnju za domacinstvo " + i + ": ");
				double potrosnja = sc.nextDouble();
				
		ukupno += potrosnja;
		
		if(potrosnja > 500) {
			preko500 += potrosnja;
			
		 }
		}	
		System.out.println("Ukupna potrosnja: " + ukupno + "kWh");
		System.out.println("Potrosnja koja je bila preko 500: " + preko500 + "kWh");
		
	sc.close();
	}
    
    
  
}