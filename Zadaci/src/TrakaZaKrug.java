import java.util.Scanner;

public class TrakaZaKrug {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Unesi povrsinu stoljnjaka: ");
		double povrsina = sc.nextDouble();
		
		 double r = Math.sqrt(povrsina/ Math.PI);  // izračun poluprečnika
	     double Obim = 2 * Math.PI * r;         // izračun obima
	     
	     System.out.printf("Obim kruga je: %.2f" , Obim);
	     
	     sc.close();
		

	}

}
