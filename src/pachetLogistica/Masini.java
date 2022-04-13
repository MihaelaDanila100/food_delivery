package pachetLogistica;

import services.Service;

public class Masini implements Service {
    private static int id = 0;
    private String nume;
    private int capacitateComenzi;
    private boolean disponibil;

    public Masini(String numeMasina, int capacitate) {
        this.nume = numeMasina;
        this.capacitateComenzi = capacitate;
        disponibil = true;
    }

    public void schimbaDisponbilitate(){
        disponibil = !disponibil;
    }

    public int getId(){
        return this.id;
    }

    @Override
    public void schimbaDisponibilitate() {
        this.disponibil = !disponibil;
    }
}
