package pachetProduse;

import java.util.List;

public class Bauturi {
    private String nume;
    private int cantitate;

    public void maresteCantitate(){
        this.cantitate += 1;
    }

    public String getNume(){
        return this.nume;
    }

    public int getCantitate(){
        return this.cantitate;
    }
}
