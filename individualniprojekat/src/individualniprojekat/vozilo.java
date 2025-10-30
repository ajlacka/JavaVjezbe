package individualniprojekat;

public class vozilo {

    protected String proizvodjac;
    protected int godinaProizvodnje;
    protected int kubikaza;
    protected String boja;
    protected boolean dizel; 
    protected String tipMotora;

    public vozilo() {
    }

    public vozilo(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja, boolean dizel) {
        this.proizvodjac = proizvodjac;
        this.godinaProizvodnje = godinaProizvodnje;
        this.kubikaza = kubikaza;
        this.boja = boja;
        this.dizel = dizel;
    }


    public vozilo(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja, String tipMotora) {
        this.proizvodjac = proizvodjac;
        this.godinaProizvodnje = godinaProizvodnje;
        this.kubikaza = kubikaza;
        this.boja = boja;
        this.tipMotora = tipMotora;
        this.dizel = tipMotora != null && tipMotora.equalsIgnoreCase("diesel");
    }

    public String getProizvodjac() {
        return proizvodjac;
    }

    public void setProizvodjac(String proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public int getKubikaza() {
        return kubikaza;
    }

    public void setKubikaza(int kubikaza) {
        this.kubikaza = kubikaza;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public boolean isDizel() {
        return dizel;
    }

    public void setDizel(boolean dizel) {
        this.dizel = dizel;
    }

    public String getTipMotora() {
        return tipMotora;
    }

    public void setTipMotora(String tipMotora) {
        this.tipMotora = tipMotora;
        this.dizel = tipMotora != null && tipMotora.equalsIgnoreCase("diesel");
    }

    public int cijenaRegistracije() {
        int cijena = 100;

        if (this.godinaProizvodnje < 2010) {
            cijena += 30;
        }
        if (this.kubikaza > 2000) {
            cijena += 20;
        }
        
        if (this.dizel || (this.tipMotora != null && this.tipMotora.equalsIgnoreCase("diesel"))) { 
            cijena += 20;
        }

        return cijena;
    }

    public String prikazInformacija() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vozilo - ");
        sb.append("Proizvodjac: ").append(proizvodjac).append(", ");
        sb.append("Godina: ").append(godinaProizvodnje).append(", ");
        sb.append("Kubikaza: ").append(kubikaza).append(", ");
        sb.append("Boja: ").append(boja).append(", ");
        sb.append("Pogon: ").append(tipMotora != null ? tipMotora : (dizel ? "Dizel" : "Benzin")).append(", ");
        sb.append("Cijena registracije: ").append(cijenaRegistracije()).append(" EUR");
        return sb.toString();
    }

}