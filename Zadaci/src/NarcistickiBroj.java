import java.util.Scanner;

public class NarcistickiBroj {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Unesi broj: ");
        int N = sc.nextInt();
        
        int originalniBroj = N;
        
        // izracunati broj cifara 
        int brojCifara = 0;
        int temp = N;
        
        while (temp > 0) {
            temp /= 10;       // skida zadnju cifru
            brojCifara++;     // povecava brojac za jedan
        }
        
        // racunanje sume cifara na stepen 
        int suma = 0;
        temp = N;
        
        while (temp > 0) {
            int cifra = temp % 10;  // uzima zadnju cifru 
            
            int stepen = 1;
            for (int i = 0; i < brojCifara; i++) {
                stepen *= cifra;    // cifra * cifra * ... (brojCifara puta)
            }

            suma += stepen;   // dodaj cifru^brojCifara u sumu
            temp /= 10;       // predji na sljedecu cifru
        }

       
        if (suma == originalniBroj) {
            System.out.println("Da");
        } else {
            System.out.println("Ne");
        }

        sc.close();
    }
}