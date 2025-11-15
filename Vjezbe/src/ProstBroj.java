import java.util.Scanner;

public class ProstBroj {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi neki broj:");
		int N = sc.nextInt();
		
		boolean prost = true;
		
		if (N < 2) {
			prost = false;
		} else {
			for (int i = 2; i < N; i++) {
				if (N % i == 0 ) {
				prost = false;
				break;
				}
			}
		}
	

		if (prost) {
			System.out.print("Broj je prost.");
		} else {
			System.out.print("Broj nije prost.");
		}
		sc.close();
	}			
	
	
}	
