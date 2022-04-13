package pachetLocaluri;

import pachetProduse.Bauturi;

import java.util.List;

public class Baruri extends Localuri {
    private List<Bauturi> bauturiDisponibile;

    public List<Bauturi> getBauturiDisponibile(){
        return this.bauturiDisponibile;
    }

    public Baruri(String nume, String localitate, String adresa, List<Bauturi> bauturiDisponibile) {
        super(nume, localitate, adresa);
        this.bauturiDisponibile = bauturiDisponibile;
    }

    public boolean verificareBauturaDisponibila(Bauturi bautura){
        if(this.bauturiDisponibile.contains(bautura)){
            return true;
        }

        return false;
    }
}
