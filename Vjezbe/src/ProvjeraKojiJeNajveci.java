import java.util.Scanner;

public class ProvjeraKojiJeNajveci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi prvi broj: ");
		int n1 = sc.nextInt();
		
		System.out.print("Unesi drugi broj: ");
		int n2 = sc.nextInt();
		
		System.out.print("Unesi treci broj: ");
		int n3 = sc.nextInt();
		
		int min = n1;
		int max = n1;
		
		// minimum
        if (n2 < min) min = n2;
        if (n3 < min) min = n3;

        // maksimum
        if (n2 > max) max = n2;
        if (n3 > max) max = n3;
        
        System.out.println("Minimum je: " + min);
        System.out.println("Maksimum je: " + max);

        sc.close();

	}

}
