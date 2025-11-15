import java.util.Scanner;

public class OsjenceniDioRavni {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi poluprecnik manjeg kruga r1: ");
        double r1 = sc.nextDouble();

        System.out.print("Unesi poluprecnik veceg kruga r2: ");
        double r2 = sc.nextDouble();

        System.out.print("Unesi broj tacaka N: ");
        int N = sc.nextInt();

        double r1kv = r1 * r1;
        double r2kv = r2 * r2;

        int brojA = 0;   
        int brojB = 0;   
        int brojC = 0;   
        int ukupno = 0; 

        for (int i = 1; i <= N; i++) {

            System.out.print("Unesi x za tacku " + i + ": ");
            double x = sc.nextDouble();

            System.out.print("Unesi y za tacku " + i + ": ");
            double y = sc.nextDouble();

            double rKv = x * x + y * y;      
            double linija = x - y - 4;       

            boolean uUnutrasnjem = (rKv <= r1kv);
            boolean uPrstenu     = (rKv >= r1kv && rKv <= r2kv);

            boolean dioA = uPrstenu && y >= 0 && x <= 0;
            boolean dioB = uUnutrasnjem && y >= 0;
            boolean dioC = uUnutrasnjem && y < 0 && x > 0 && linija >= 0;

            if (dioA) brojA++;
            if (dioB) brojB++;
            if (dioC) brojC++;

            if (dioA || dioB || dioC) {
                ukupno++;
            }
        }

        System.out.println("Ukupan broj tacaka u osjencenom dijelu: " + ukupno);
        System.out.println("Broj tacaka u dijelu A (spoljasnji prsten gore lijevo): " + brojA);
        System.out.println("Broj tacaka u dijelu B (gornja polovina unutrasnjeg kruga): " + brojB);
        System.out.println("Broj tacaka u dijelu C (donji desni dio unutrasnjeg kruga iznad prave): " + brojC);

        sc.close();
    }
}