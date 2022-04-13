package pachetLocaluri;

import pachetProduse.Preparate;

import java.util.List;

public class Restaurante extends Localuri {
    private List<Preparate> preparateDisponibile;

    public Restaurante(String nume, String localitate, String adresa, List<Preparate> preparateDisponibile) {
        super(nume, localitate, adresa);
        this.preparateDisponibile = preparateDisponibile;
    }
}
