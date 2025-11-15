import java.util.Scanner;

public class ProsjekStanovnika {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi broj stanovnika za grad 1: ");
		int a = sc.nextInt();
		System.out.print("Unesi broj stanovnika za grad 2: ");
		int b = sc.nextInt();
		System.out.print("Unesi broj stanovnika za grad 3: ");
		int c = sc.nextInt();
		System.out.print("Unesi broj stanovnika za grad 4: ");
		int d = sc.nextInt();
		
		int prosjek = (a + b + c + d) / 4;
		
		System.out.print("Prosjek stanovnika za ova cetiri grada je: " + prosjek);
		
		sc.close();
	}

}
