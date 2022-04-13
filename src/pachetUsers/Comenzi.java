package pachetUsers;

import java.util.Date;

public class Comenzi {
    protected static int id = 0;
    protected Date oraPrimirii;
    protected Date oraLivrarii;
    protected int idLocal;
    protected int idUser;

    public Comenzi(Date oraPrimirii, int idLocal, int idUser) {
        this.oraPrimirii = oraPrimirii;
        this.idLocal = idLocal;
        this.idUser = idUser;
    }

    public void setOraLivrarii(Date oraFinala){
        this.oraLivrarii = oraFinala;
    }
}
