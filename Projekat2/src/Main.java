public class Main {
    public static void main(String[] args) {
        Restoran r = new Restoran("Trattoria Bella", "Ulica Kralja Petra I 14, Novi Sad", "987654321");

        r.dodajZaposlenog(new Konobar(1, "Milan", "Radovanović", 7.5, 40, 6));
        r.dodajZaposlenog(new Kuvar(2, "Jelena", "Marković", 9.0, 38));
        r.dodajZaposlenog(new Menadzer(3, "Nikola", "Ilić", 11.5, 36, 250));
        r.dodajZaposlenog(new Konobar(4, "Teodora", "Ristić", 8.0, 42, 4));
        r.dodajZaposlenog(new Kuvar(5, "Petar", "Kostić", 10.5, 37));

        r.generisiObracun("Novembar", 2025);
    }
}
