import pachetLocaluri.Restaurante;
import pachetProduse.Bauturi;
import pachetProduse.Preparate;
import pachetUsers.ComenziRestaurante;
import pachetUsers.Useri;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Useri> listaUtilizatori = new ArrayList<Useri>();

        List<Preparate> preparateRestaurant = new ArrayList<Preparate>();

        List<String> listIngrediente = new ArrayList<String>();
        listIngrediente.add("piept de pui");
        listIngrediente.add("sare");

        Preparate p = new Preparate("Piept de pui", 1, listIngrediente);
        preparateRestaurant.add(p);

        Restaurante restaurant = new Restaurante("Restaurant SRL", "Bucuresti", "Bulevardul Iuliu Maniu", preparateRestaurant);

        Scanner keyboard = new Scanner(System.in);

        String numeUser, prenumeUser, localitateUser, adresaUser;

        System.out.println("Introduceti utilizator: ");

        System.out.println("Nume: ");
        numeUser = keyboard.nextLine().toString();

        System.out.println("Prenume: ");
        prenumeUser = keyboard.nextLine().toString();

        System.out.println("Localitate: ");
        localitateUser = keyboard.nextLine().toString();

        System.out.println("Adresa: ");
        List<String> adrseUser = new ArrayList<String>();
        adresaUser = keyboard.nextLine().toString();
        adrseUser.add(adresaUser);

        Useri newUser = new Useri(numeUser, prenumeUser, localitateUser, adrseUser);
        Preparate comandaUser = new Preparate("piept de pui", 1);
        List<Preparate> listComandaUser = new ArrayList<Preparate>();
        listComandaUser.add(comandaUser);

        ComenziRestaurante comandaUser1 = new ComenziRestaurante(new Date(System.currentTimeMillis()), 0, 0, listComandaUser);

        preparateRestaurant.get(0).schimbaDisponibilitate();
    }
}
