import java.util.Scanner;
	
public class AriSred_Cifara {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi neki broj: ");
		int N = sc.nextInt();
		
		int zbir = 0;
		int brojCifara= 0;
		
		int temp = N;
		
		while (temp > 0) {
			int cifra = temp % 10;
			zbir += cifra;
			brojCifara++;
			temp /= 10;
			
		}
		double aritmeticka = (double)zbir / brojCifara;
		
		System.out.print("Aritmeticka sredina cifara je " + aritmeticka + ".");
		
		sc.close();
	}

}
