import java.util.Scanner;

public class PreklapanjePravogaonika {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi x1 kordinatu za prozor: ");
		double x1 = sc.nextDouble();
		System.out.println("Unesi y1 kordinatu za prozor: ");
		double y1 = sc.nextDouble();
		System.out.println("Unesi x2 kordinatu za prozor: ");
		double x2 = sc.nextDouble();
		System.out.println("Unesi y2 kordinatu za prozor: ");
		double y2 = sc.nextDouble();
		
		System.out.println("Unesi x1 kordinatu za zavjesu: ");
		double zx1 = sc.nextDouble();
		System.out.println("Unesi y1 kordinatu za zavjesu: ");
		double zy1 = sc.nextDouble();
		System.out.println("Unesi x2 kordinatu za zavjesu: ");
		double zx2 = sc.nextDouble();
		System.out.println("Unesi y2 kordinatu za zavjesu: ");
		double zy2 = sc.nextDouble();
		
		double sirinaProzora = Math.abs(x1-x2);
		double visinaProzora = Math.abs(y1-y2);
		
		double sirinaZavjese = Math.abs(zx1-zx2);
		double visinaZavjese = Math.abs(zy1-zy2);
		
		 if (sirinaZavjese >= sirinaProzora && visinaZavjese >= visinaProzora) {
	            System.out.println("Zavjesa prekriva prozor.");
	        } else {
	            System.out.println("Zavjesa ne prekriva prozor.");
	        }
		sc.close();
		
		
	}

}
