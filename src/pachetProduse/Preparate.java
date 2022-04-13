package pachetProduse;

import services.Service;

import java.util.ArrayList;
import java.util.List;

public class Preparate implements Service {
    private String nume;
    private int cantitate;
    private List<String> ingrediente;
    private boolean disponibil;

    public Preparate(String nume, int cantitate) {
        this.nume = nume;
        this.cantitate = cantitate;
        this.ingrediente = new ArrayList<String>();
        disponibil = true;
    }

    public Preparate(String nume, int cantitate, List<String> ingrediente) {
        this.nume = nume;
        this.cantitate = cantitate;
        this.ingrediente = ingrediente;
        disponibil = true;
    }

    public void schimbaCantitate(Integer nouaCantitate){
        this.cantitate = nouaCantitate;
    }

    public void schimbaDisponibilitate(){
        disponibil = !disponibil;
    }
}
