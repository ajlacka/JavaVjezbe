import java.util.Scanner;

public class TackaUPravougaoniku {

	public static void main(String[] args) {

			Scanner sc = new Scanner (System.in);
			
			System.out.print("Unesi x1: ");
			double x1 = sc.nextDouble();
			
			System.out.print("Unesi y1: ");
			double y1 = sc.nextDouble();
			
			System.out.print("Unesi x2: ");
			double x2 = sc.nextDouble();
			
			System.out.print("Unesi y2: ");
			double y2 = sc.nextDouble();
			
			System.out.print("Unesi xt: ");
			double xt = sc.nextDouble();
			
			System.out.print("Unesi yt: ");
			double yt = sc.nextDouble();
			

			
			if (xt >= x1 && xt <= x2 && yt <= y1 && yt >= y2) {
				System.out.print("Tacka se nalazi u pravougaoniku. ");
			} else {
				System.out.print("Tacka se NE nalazi u pravougaoniku. ");
			}
			sc.close();
			
			
	}
}
