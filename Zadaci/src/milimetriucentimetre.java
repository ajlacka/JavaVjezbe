import java.util.Scanner;

public class milimetriucentimetre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi sirinu lista papira u milimetrima:");
		double sirina = sc.nextDouble();
		
		System.out.print("Unesi duzinu lista papira u milimetrima:");
		double duzina = sc.nextDouble();

		double sirinaUcm = sirina / 10;
		double duzinaUcm = duzina / 10; 
		
		double povrsina = sirinaUcm * duzinaUcm ;
		double obim = 2 * (sirinaUcm + duzinaUcm);
		
		System.out.println("Povrsina papira u centimetrima je;" + povrsina);
		System.out.println("Obim papira u centimetrima je;" + obim);
		
		sc.close();
		
	}

}
