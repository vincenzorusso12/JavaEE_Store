package archivio;

import java.util.List;
import javax.ejb.Remote;


@Remote
public interface NegozioEJBRemote {
    Negozio findById(int id);
    List<Negozio> findByRegione(String regione);
    List<Negozio> findAll();
    List<Negozio>findActiveShops();
    Negozio createNegozio(Negozio m);
    Negozio updateNegozio(Negozio m);
    void deleteNegozio(Negozio m);
}
