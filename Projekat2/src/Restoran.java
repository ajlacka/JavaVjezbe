import java.util.*;

public class Restoran {
    private String naziv;
    private String adresa;
    private String pib;
    private ArrayList<Zaposleni> zaposleni = new ArrayList<>();

    public Restoran(String naziv, String adresa, String pib) {
        this.naziv = naziv;
        this.adresa = adresa;
        this.pib = pib;
    }

    public void dodajZaposlenog(Zaposleni z) {
        zaposleni.add(z);
    }

    public void ukloniZaposlenog(int id) {
        zaposleni.removeIf(z -> z.getId() == id);
    }

    public Zaposleni nadjiZaposlenog(int id) {
        for (Zaposleni z : zaposleni)
            if (z.getId() == id) return z;
        return null;
    }

    public void generisiObracun(String mjesec, int godina) {
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-5s %-15s %-12s %-10s %-10s %-15s %s\n",
                "ID", "Ime", "Prezime", "Tip", "Sati", "Napomena", "Plata");
        System.out.println("------------------------------------------------------------");

        double ukupno = 0;

        for (Zaposleni z : zaposleni) {
            double iznos = z.izracunajPlatu();
            String napomena = "";

            if (z instanceof Konobar konobar)
                napomena = "Prekovremeni: " + konobar.getPrekovremeniSati();
            else if (z instanceof Menadzer menadzer)
                napomena = "Bonus: " + menadzer.getBonus() + " €";

            ObracunPlate obr = new ObracunPlate(mjesec, godina, z, iznos, napomena);
            System.out.println(obr);
            ukupno += iznos;
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("Ukupan trošak plata: %.2f €\n", ukupno);
    }
}
