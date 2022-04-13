package pachetUsers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Useri {
    private static int id = 0;
    private String nume;
    private String prenume;
    private String localitate;
    private List<String> adrese;
    private List<Comenzi> comenziEfectuate;
    private List<Integer> cupoaneReducere;

    public Useri(String nume, String prenume, String localitate, List<String> adrese) {
        this.nume = nume;
        this.prenume = prenume;
        this.localitate = localitate;
        this.adrese = adrese;
        comenziEfectuate = new ArrayList<Comenzi>();
        cupoaneReducere = new ArrayList<Integer>();
    }

    public void adaugaComanda(Comenzi c){
        comenziEfectuate.add(c);
    }

    public int getNumarComenzi(){
        return this.comenziEfectuate.size();
    }

    public void adaugaCupon(){
        Random rn = new Random();
        int maxim = 19234 - 100;
        int cupon = rn.nextInt() % maxim;
        this.cupoaneReducere.add(cupon);
    }
}
