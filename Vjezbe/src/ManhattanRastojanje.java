import java.util.Scanner;

public class ManhattanRastojanje {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi x0: ");
        int x0 = sc.nextInt();

        System.out.print("Unesi y0: ");
        int y0 = sc.nextInt();

        System.out.print("Unesi broj incidenata: ");
        int N = sc.nextInt();

        System.out.println("Unesi koordinate incidenta 1:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        int d1 = Math.abs(x1 - x0) + Math.abs(y1 - y0);
        System.out.println("Rastojanje za incident 1 je: " + d1);

        int minDist = d1;         
        int maxDist = d1;         
        int najblizi = 1;         
        int najdalji = 1;        

        for (int i = 2; i <= N; i++) {

            System.out.println("Unesi koordinate incidenta " + i + ":");
            int xi = sc.nextInt();
            int yi = sc.nextInt();

            int d = Math.abs(xi - x0) + Math.abs(yi - y0);
            System.out.println("Rastojanje za incident " + i + " je: " + d);

            if (d < minDist) {
                minDist = d;
                najblizi = i;
            }

            if (d > maxDist) {
                maxDist = d;
                najdalji = i;
            }
        }

        System.out.println("Najblizi incident je broj " + najblizi + " sa rastojanjem " + minDist);
        System.out.println("Najdalji incident je broj " + najdalji + " sa rastojanjem " + maxDist);

        sc.close();
    }
}