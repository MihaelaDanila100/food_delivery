package pachetLocaluri;

public class Localuri {
    protected static int id = 0;
    protected String nume;
    protected String localitate;
    protected String adresa;

    public Localuri(String nume, String localitate, String adresa) {
        this.nume = nume;
        this.localitate = localitate;
        this.adresa = adresa;
    }
}
