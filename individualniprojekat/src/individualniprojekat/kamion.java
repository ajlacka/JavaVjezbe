package individualniprojekat;

public class kamion extends vozilo {

    private int kapacitetTereta; 
    private boolean prikolica;

    public kamion(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja,
                  boolean dizel, int kapacitetTereta, boolean prikolica) {
        super(proizvodjac, godinaProizvodnje, kubikaza, boja, dizel);
        this.kapacitetTereta = kapacitetTereta;
        this.prikolica = prikolica;
    }

    public int getKapacitetTereta() {
        return kapacitetTereta;
    }

    public void setKapacitetTereta(int kapacitetTereta) {
        this.kapacitetTereta = kapacitetTereta;
    }

    public boolean isPrikolica() {
        return prikolica;
    }

    public void setPrikolica(boolean prikolica) {
        this.prikolica = prikolica;
    }


    public int cijenaRegistracije() {
        int cijena = super.cijenaRegistracije();

        if (kapacitetTereta > 5000) {
            cijena += 50;
        }
        if (prikolica) {
            cijena += 30;
        }

        return cijena;
    }


    public String prikazInformacija() {
        return super.prikazInformacija()
                + ", Kapacitet tereta: " + kapacitetTereta + " kg"
                + ", Prikolica: " + (prikolica ? "da" : "ne");
    }
}