package pachetUsers;

import pachetProduse.Preparate;

import java.util.Date;
import java.util.List;

public class ComenziRestaurante extends Comenzi {
    private List<Preparate> preparateComandate;

    public ComenziRestaurante(Date oraPrimirii, int idLocal, int idUser, List<Preparate> listaPreparate) {
        super(oraPrimirii, idLocal, idUser);
        this.preparateComandate = listaPreparate;
    }
}
