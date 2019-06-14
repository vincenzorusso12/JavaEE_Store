package archivio;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class DBProducer {
    @Produces
    @PersistenceContext(unitName = "EsamePU")
    private EntityManager em;
}
