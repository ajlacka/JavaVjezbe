import java.util.Scanner;

public class Igra_FizzBuzz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi neki cijeli broj: ");
		int broj = sc.nextInt();
		
		if (broj%5 == 0 && broj%3 == 0 ) {
			System.out.println("FizzBuzz");
		}else if (broj % 5 == 0 ) {
			System.out.println("Buzz");
		} else if (broj % 3 == 0) {
			System.out.println("Fizz");
		}else {
			System.out.print(broj);
				
		}
		
		sc.close();
		
				

	}

}
