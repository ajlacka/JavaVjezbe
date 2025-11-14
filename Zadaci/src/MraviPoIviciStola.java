import java.util.Scanner;

public class MraviPoIviciStola {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi koordinate tjemena desne gornje (x1 y1): ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();

		System.out.println("Unesi koordinate tjemena lijeve donje (x2 y2): ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();

		System.out.println("Unesi broj mrava: ");
		int N = sc.nextInt();
		
		int brojNaIvici = 0;
		
		for(int i = 1; N >= i; i++ ) {
			System.out.println("Unesi koordinate mrava (xm ym): ");
			double xm = sc.nextDouble();
			double ym = sc.nextDouble();
			
			 boolean naIvici =
	                    ( (xm == x1 || xm == x2) && (ym >= y1 && ym <= y2) ) ||
	                    ( (ym == y1 || ym == y2) && (xm >= x1 && xm <= x2) );
			 if(naIvici) {
				 brojNaIvici++;
				 
			 }
			 
		}
		System.out.println("Broj mrava na ivici je " + brojNaIvici + ".");
		
		sc.close();
	}

}
