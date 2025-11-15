import java.util.Scanner;

public class CarobnjakMagija {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi x0 carobnjaka: ");
        double x0 = sc.nextDouble();

        System.out.print("Unesi y0 carobnjaka: ");
        double y0 = sc.nextDouble();

        System.out.print("Unesi poluprecnik magije R: ");
        double R = sc.nextDouble();

        System.out.print("Unesi broj neprijatelja N: ");
        int N = sc.nextInt();

        double Rkv = R * R;

        int pogodjeni = 0;
        double minDist2 = 0;
        int indeksNajblizeg = -1;

        for (int i = 1; i <= N; i++) {
            System.out.println("Unesi koordinate neprijatelja " + i + ":");
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            double dx = x - x0;
            double dy = y - y0;
            double dist2 = dx * dx + dy * dy;

            if (dist2 <= Rkv) {
                pogodjeni++;
                if (indeksNajblizeg == -1 || dist2 < minDist2) {
                    minDist2 = dist2;
                    indeksNajblizeg = i;
                }
            }
        }

        System.out.println("Pogodjeno neprijatelja: " + pogodjeni);

        if (indeksNajblizeg != -1) {
            double najblizeRastojanje = Math.sqrt(minDist2);
            System.out.println("Najblizi pogodjeni neprijatelj je broj " + indeksNajblizeg +
                               " sa rastojanjem " + najblizeRastojanje);
        } else {
            System.out.println("Nijedan neprijatelj nije u dometu magije.");
        }

        sc.close();
    }
}