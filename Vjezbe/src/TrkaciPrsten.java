import java.util.Scanner;

public class TrkaciPrsten {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi cx: ");
        double cx = sc.nextDouble();

        System.out.print("Unesi cy: ");
        double cy = sc.nextDouble();

        System.out.print("Unesi poluprecnik manjeg kruga R1: ");
        double R1 = sc.nextDouble();

        System.out.print("Unesi poluprecnik veceg kruga R2: ");
        double R2 = sc.nextDouble();

        System.out.print("Unesi broj trkaca N: ");
        int N = sc.nextInt();

        double R1kv = R1 * R1;
        double R2kv = R2 * R2;

        int brojUPrstenuGore = 0;
        double maxDist2 = -1;
        int indeksNajudaljenijeg = -1;

        for (int i = 1; i <= N; i++) {
            System.out.println("Unesi koordinate trkaca " + i + ":");
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            double dx = x - cx;
            double dy = y - cy;
            double dist2 = dx * dx + dy * dy;

            if (dist2 >= R1kv && dist2 <= R2kv && y >= cy) {
                brojUPrstenuGore++;
            }

            if (dist2 > maxDist2) {
                maxDist2 = dist2;
                indeksNajudaljenijeg = i;
            }
        }

        System.out.println("Broj trkaca u prstenu u gornjoj poluravni: " + brojUPrstenuGore);

        if (indeksNajudaljenijeg != -1) {
            double najudaljenijeRastojanje = Math.sqrt(maxDist2);
            System.out.println("Najudaljeniji trkac je broj " + indeksNajudaljenijeg +
                               " sa rastojanjem " + najudaljenijeRastojanje);
        }

        sc.close();
    }
}