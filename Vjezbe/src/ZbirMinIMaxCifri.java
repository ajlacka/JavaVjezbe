import java.util.Scanner;

public class ZbirMinIMaxCifri {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi neki broj: ");
		int N = sc.nextInt();
		
		int temp = N;
		
		int min = 9;
		int max = 0;
		
		while (temp > 0) {
			int cifra = temp % 10; //uzima zadnju cifru
			if (cifra < min) min = cifra;
			if (cifra > max) max = cifra;
			temp /=  10 ; //skida cifru kako ne bi vreceli sve istu
		}
			int zbir = min + max;
			
			System.out.print("Zbir najmanje i najvrce cifre je: " + zbir + ".");
			
			sc.close();
			
					
		}
	}


