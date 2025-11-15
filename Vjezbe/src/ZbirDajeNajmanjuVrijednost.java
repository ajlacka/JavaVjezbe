import java.util.Scanner;

public class ZbirDajeNajmanjuVrijednost {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi cijenu prvog proizvoda: ");
		double c1 = sc.nextDouble();
		
		System.out.print("Unesi cijenu drugog proizvoda: ");
		double c2 = sc.nextDouble();
		
		System.out.print("Unesi cijenu treceg proizvoda: ");
		double c3 = sc.nextDouble();
		
		double k1 = c1 + c2;
		double k2 = c1 + c3;
		double k3 = c2 + c3;
		
		double min = k1;
		
        if (k2 < min) min = k2;
        if (k3 < min) min = k3;

        System.out.print("Minimalni zbir proizvoda je: " + min);
        
        sc.close();
        
	}

}
