package pachetLogistica;

import services.Service;

public class Soferi implements Service{
    private String nume;
    private int varsta;
    private String localitate;
    private int idMasina;
    private boolean disponibil;

    public void asociazaMasina(Masini m){
        int idM = m.getId();
        this.idMasina = idM;
    }

    @Override
    public void schimbaDisponibilitate() {
        this.disponibil = !disponibil;
    }
}
