public class PovrsinaMonitoraDijagonala {

    public static void main(String[] args) {

        double d = 50;   
        double odnosS = 16; 
        double odnosV = 9;

        //pitagorina
        double k = Math.sqrt((d * d) / (odnosS * odnosS + odnosV * odnosV));

        double sirina = odnosS * k;
        double visina = odnosV * k;

        double povrsina = sirina * visina;

        System.out.println("Povrsina ekrana je: " + povrsina);
    }
}