package individualniprojekat;

public class projekat1 {

    public static void main(String[] args) {
        // create several vehicles
        vozilo v1 = new automobil("Toyota", 2008, 1800, "Crvena", 4, "benzine");
        vozilo v2 = new automobil("Volkswagen", 2015, 2000, "Plava", 5, "diesel");
        vozilo v3 = new kamion("Scania", 2005, 5000, "Bijela", true, 8000, true);
        vozilo v4 = new kombi("Ford", 2012, 2200, "Siva", true, 9);

        vozilo[] vozila = {v1, v2, v3, v4};

        for (vozilo v : vozila) {
            System.out.println(v.prikazInformacija());
            System.out.println();
        }
    }
}