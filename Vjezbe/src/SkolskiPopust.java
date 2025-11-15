import java.util.Scanner;

public class SkolskiPopust {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi puni iznos skolarine: ");
		int skolarina = sc.nextInt();
		
		System.out.print("Unesi prosjek ucenika: ");
		double prosjek = sc.nextDouble();
		
		if (prosjek >= 5 && prosjek < 0) {
			System.out.print("Prosjek ne moze biti preko pet i negativan!");
			sc.close();
			return;
		}
		
		System.out.print("Unesi da li je ucenik osvoio nagradu (0 = ne, 1 = da): ");
		int nagradaUnos = sc.nextInt();

		boolean nagrada = (nagradaUnos == 1);
		
		double popustUspjeha = 0.0 ;
		
		if (prosjek >= 4.5) {
			popustUspjeha = 0.4;
		}
		else if (prosjek >= 3.5) {
			popustUspjeha = 0.2;
		}
		else if (prosjek >= 2.5) {
			popustUspjeha = 0.1;
		}
		else {
			popustUspjeha = 0.0;
		}
		//popust za nagrdau koji ako je tacan uzima prvo ako nije onda drugo(isto kao else if)
		double popustNagrada = nagrada ? 0.3 : 0.0 ;
		
		//promjeni vrijednost popusta u onaj koji je veci
		double popust = popustUspjeha;
		if (popust < popustNagrada) {
			popust = popustNagrada;
		}
		
		double cijena = skolarina - (skolarina * popust);
		// math.round zaokruzuje broj
        long konacnaCijena = Math.round(cijena);

        System.out.println("Ucenik treba da plati: " + konacnaCijena + " EUR");

        sc.close();
	}

}
