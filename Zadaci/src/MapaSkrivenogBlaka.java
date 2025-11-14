import java.util.Scanner;

public class MapaSkrivenogBlaka {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi koordinate hrasa (x1): ");
		double x1 = sc.nextDouble();
		
		System.out.println("Unesi koordinate hrasta (y1): ");
		double y1 = sc.nextDouble();
		
		System.out.println("Unesi koordinate stara kuca (x2): ");
		double x2 = sc.nextDouble();
		
		System.out.println("Unesi koordinate stara kuca (y2): ");
		double y2 = sc.nextDouble();
		
		double xT = x2 + 2; // T jer je kao blago (tresure)
		double yT = y2 - 3;
		
		double rastojanjeGT = Math.sqrt(
                (xT - x1) * (xT - x1) + (yT - y1) * (yT - y1)
        );

		//rastojanje od hrasta do kuce
		double rastojanjeGK = Math.sqrt(
                (x2 - x1) * (x2 - x1) +(y2 - y1) * (y2 - y1)
        );
		//rastojanje od kuce do blaga
		double rastojanjeKT = Math.sqrt(
                (xT - x2) * (xT - x2) +(yT - y2) * (yT - y2)
        );

		double ukupnoPrekoKuce = rastojanjeGK + rastojanjeKT;
		
		System.out.println("Koordinate blaga: (" + xT + ", " + yT + ")");
        System.out.printf("Vazdusno rastojanje G → T: %.2f%n", rastojanjeGT);
        System.out.printf("Rastojanje G → T preko kuce: %.2f%n", ukupnoPrekoKuce);

        sc.close();
        
	}

}
