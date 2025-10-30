package individualniprojekat;

public class kombi extends vozilo {

    private int brojPutnika;

    public kombi(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja, boolean dizel, int brojPutnika) {
        super(proizvodjac, godinaProizvodnje, kubikaza, boja, dizel);
        this.brojPutnika = brojPutnika;
    }

    public int getBrojPutnika() {
        return brojPutnika;
    }

    public void setBrojPutnika(int brojPutnika) {
        this.brojPutnika = brojPutnika;
    }

    public int cijenaRegistracije() {
        int cijena = super.cijenaRegistracije();
        if (brojPutnika > 8) {
            cijena += 30;
        }
        return cijena;
    }

    public String prikazInformacija() {
        return super.prikazInformacija() + 
               ", Broj putnika: " + brojPutnika;
    }
}