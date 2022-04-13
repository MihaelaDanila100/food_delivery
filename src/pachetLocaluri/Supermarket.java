package pachetLocaluri;

import java.util.HashMap;
import java.util.Map;

public class Supermarket extends Localuri {
    private Map<String, Integer> alimente;

    public Supermarket(String nume, String localitate, String adresa) {
        super(nume, localitate, adresa);
        this.alimente = new HashMap<String, Integer>();
    }

    public Supermarket(String nume, String localitate, String adresa, Map<String, Integer> alimente) {
        super(nume, localitate, adresa);
        this.alimente = alimente;
    }

    private void consumaAlimente(String aliment, Integer cantitate){
        alimente.put(aliment, alimente.get(aliment) + cantitate);
    }
}
