import java.util.Scanner;

public class SusretStudenata_EuklidskoRastojanje {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi koordinate prvog studenta (x1 y1): ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		System.out.print("Unesi koordinate drugog studenta (x1 y1): ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		double x3 = (x1 + x2) / 2;
		double y3 = (y1 + y2) / 2;
		
		//racunamo rastojanje
		double x = x3 - x1;
		double y = y3 - y1;
		double rastojanje = Math.sqrt(x * x + y * y); //euklidsko rastojanje
		
		System.out.print("Rastojanje koje je u pitanju je " + rastojanje);
		
		sc.close();
		
	}

}
