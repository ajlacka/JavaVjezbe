import java.util.Scanner;

public class ObimStola {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi polupreznik prvog stola: ");
		double r1 = sc.nextInt();
		
		System.out.print("Unesi polupreznik drugog stola: ");
		double r2 = sc.nextInt();
		
		double P1 = r1 * r1 * Math.PI;
        double P2 = r2 * r2 * Math.PI;

        if (P1 > P2) {
        	double O1 = 2 * r1 * Math.PI;
        	System.out.print("Obim stola sa vrcom povrsinom je: " + O1);
        }else {
        	double O2 = 2 * r1 * Math.PI;
        	System.out.print("Obim stola sa vecom povrsinom je: " + O2);
        	
        }
		sc.close();
		
	}

}
