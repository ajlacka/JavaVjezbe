import java.util.Scanner;

public class ZamjenaVarijabli {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Upisi vrijednost a: ");
		int a = sc.nextInt();
		
		System.out.print("Upisi vrijednost b: ");
		int b = sc.nextInt();

		int temp = a;
		a = b;
		b = temp;
		
		System.out.print("Tacan ispis za Anu je " + a + ", a za Milicu je " + b + ".");
		
		sc.close();

	}

}
