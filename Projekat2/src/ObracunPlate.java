public class ObracunPlate {
    private String mjesec;
    private int godina;
    private Zaposleni zaposleni;
    private double iznos;
    private String napomena;

    public ObracunPlate(String mjesec, int godina, Zaposleni zaposleni, double iznos, String napomena) {
        this.mjesec = mjesec;
        this.godina = godina;
        this.zaposleni = zaposleni;
        this.iznos = iznos;
        this.napomena = napomena;
    }

    @Override
    public String toString() {
        return String.format("%-5d %-15s %-12s %-10s %-10d %-15s %.2f €",
                zaposleni.getId(),
                zaposleni.getIme(),
                zaposleni.getPrezime(),
                zaposleni.getTip(),
                zaposleni.ukupanBrojSati,
                napomena,
                iznos);
    }

    public double getIznos() {
        return iznos;
    }
}
