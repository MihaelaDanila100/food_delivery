package pachetUsers;

import pachetProduse.Bauturi;

import java.util.Date;
import java.util.List;

public class ComenziBaruri extends Comenzi {
    private List<Bauturi> bauturiComandate;

    public ComenziBaruri(Date oraPrimirii, int idLocal, int idUser, List<Bauturi> listaBauturi) {
        super(oraPrimirii, idLocal, idUser);
        this.bauturiComandate = listaBauturi;
    }
}
