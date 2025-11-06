public class Menadzer extends Zaposleni {
    private double bonus;

    public Menadzer(int id, String ime, String prezime, double plataPoSatu, int ukupanBrojSati, double bonus) {
        super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
        this.bonus = bonus;
    }

    @Override
    public double izracunajPlatu() {
        return 1300 + 4 * ukupanBrojSati * plataPoSatu + bonus;
    }

    @Override
    public String getTip() {
        return "Menadžer";
    }

    public double getBonus() {
        return bonus;
    }
}
