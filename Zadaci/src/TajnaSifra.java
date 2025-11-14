import java.util.Scanner;

public class TajnaSifra {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Unesite trocifrenu sifru: ");
		int sifra = sc.nextInt();
		
		if (sifra< 100 || sifra > 999) {
            System.out.println("Greska: broj mora biti trocifren!");
            sc.close();
            return;
		}
		
		int cifra1 = sifra / 100;
		int cifra2 = (sifra / 10) % 10;
		int cifra3 = sifra % 10;
		
		int zbir = cifra1 + cifra2 + cifra3;
		int proizvod = cifra1 * cifra2 * cifra3;
		
		int tajniKod = proizvod - zbir;
		
		System.out.println("Tajni kod je: " + tajniKod);
		
		sc.close();
		

	 }
}

