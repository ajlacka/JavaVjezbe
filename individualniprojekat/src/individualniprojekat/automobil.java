package individualniprojekat;

public class automobil extends vozilo {

    private int brojVrata;

    public automobil(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja,
                     int brojVrata, String tipMotora) {
        super(proizvodjac, godinaProizvodnje, kubikaza, boja, tipMotora);
        this.brojVrata = brojVrata;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    @Override
    public int cijenaRegistracije() {
        int cijena = super.cijenaRegistracije();
        if (getTipMotora() != null && getTipMotora().equalsIgnoreCase("diesel")) {
            cijena += 50;
        }
        return cijena;
    }

    @Override
    public String prikazInformacija() {
        StringBuilder sb = new StringBuilder();
        sb.append("Automobil - ");
        sb.append("Proizvodjac: ").append(proizvodjac).append(", ");
        sb.append("Godina: ").append(godinaProizvodnje).append(", ");
        sb.append("Kubikaza: ").append(kubikaza).append(", ");
        sb.append("Boja: ").append(boja).append(", ");
        sb.append("Broj vrata: ").append(brojVrata).append(", ");
        sb.append("Tip motora: ").append(getTipMotora()).append(", ");
        sb.append("Cijena registracije: ").append(cijenaRegistracije()).append(" EUR");
        return sb.toString();
    }

}