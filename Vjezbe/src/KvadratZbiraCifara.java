import java.util.Scanner;

public class KvadratZbiraCifara {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi cetvorocifreni broj: ");
		int broj = sc.nextInt();
		
		  if (broj < 1000 || broj > 9999) {
	            System.out.println("Greska: broj mora biti cetvorocifren!");
	            sc.close();
	            return;
		  }
	      int c1 = broj % 10;          // poslednja cifra
	      int c2 = (broj / 10) % 10;   
	      int c3 = (broj / 100) % 10;  
	      int c4 = broj / 1000;        // prva cifra
	      
	      int zbir = c1 + c2 + c3 + c4;
	      int kvadrat = zbir * zbir;
	      
	      System.out.print("Kvadrat zbira cifara je " + kvadrat + ".");
	      
	      sc.close();
	            
	}  
}
