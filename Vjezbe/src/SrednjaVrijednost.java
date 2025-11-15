import java.util.Scanner;

public class SrednjaVrijednost {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi vrijednost a: ");
		int a = sc.nextInt();
		
		System.out.println("Unesi vrijednost b: ");
		int b = sc.nextInt();
		
		int rezultat = (a + b) / 2;
		
		System.out.println("Srednja vrijednost je " + rezultat + ".");
		
		sc.close();
	}

}
