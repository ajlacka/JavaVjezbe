public abstract class Zaposleni {
    protected int id;
    protected String ime;
    protected String prezime;
    protected double plataPoSatu;
    protected int ukupanBrojSati;

    public Zaposleni(int id, String ime, String prezime, double plataPoSatu, int ukupanBrojSati) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.plataPoSatu = plataPoSatu;
        this.ukupanBrojSati = ukupanBrojSati;
    }

    public int getId() { return id; }
    public String getIme() { return ime; }
    public String getPrezime() { return prezime; }

    public abstract double izracunajPlatu(); // svaka podklasa ima svoj način obračuna

    public abstract String getTip(); // da znamo da li je Konobar, Kuvar, Menadžer
}
