public class Konobar extends Zaposleni {
    private int prekovremeniSati;

    public Konobar(int id, String ime, String prezime, double plataPoSatu, int ukupanBrojSati, int prekovremeniSati) {
        super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
        this.prekovremeniSati = prekovremeniSati;
    }

    @Override
    public double izracunajPlatu() {
        double osnovno = 4 * ukupanBrojSati * plataPoSatu;
        double prekovremeno = 4 * prekovremeniSati * plataPoSatu * 1.2;
        return osnovno + prekovremeno;
    }

    @Override
    public String getTip() {
        return "Konobar";
    }

    public int getPrekovremeniSati() {
        return prekovremeniSati;
    }
}
