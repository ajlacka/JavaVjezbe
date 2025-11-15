import java.util.Scanner;

public class ZbirParnihProizvodNeparnih {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi cetvorocifreni broj: ");
		int broj = sc.nextInt();
		
		if (broj < 1000 || broj > 9999) {
            System.out.println("Greska: broj mora biti cetvorocifren!");
            sc.close();
            return;
        }

		int c1 = broj / 1000;
		int c2 = (broj / 100) % 10;
		int c3 = (broj / 10) % 10;
		int c4 = broj % 10;
		
		
		if (broj % 2 == 0 ) {
			int zbir = 0;
			
			if (c1 % 2 == 0) zbir += c1;
			if (c2 % 2 == 0) zbir += c2;
			if (c3 % 2 == 0) zbir += c3;
			if (c4 % 2 == 0) zbir += c4;
			
			System.out.print("Zbir parnog broja je: " + zbir + ".");
		}
		else {
			int proizvod = 1;
			
			if (c1 % 2 != 0) proizvod *= c1;
			if (c2 % 2 != 0) proizvod *= c2;
			if (c3 % 2 != 0) proizvod *= c3;
			if (c4 % 2 != 0) proizvod *= c4;
			
			System.out.print("Proizvod neparnog broja je: " + proizvod + ".");
		}
		sc.close();
	}

}
