package archivio;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

@Interceptors(NegozioInterceptor.class) // Sostituito @InterfaceInterceptor con @Interceptors più in alto
@Stateless
@LocalBean

public class NegozioEJB implements NegozioEJBRemote {

    @Inject
    private EntityManager em;
    
    
    @Override
    public Negozio findById(int id)
    {
        TypedQuery <Negozio> query = em.createNamedQuery("FINDBYID",Negozio.class);
        query.setParameter("id",id);
        return query.getSingleResult();
    }

    @Override
    

    public List<Negozio> findByRegione(String regione)
    {
        TypedQuery <Negozio> query = em.createNamedQuery("FINDBYREGION",Negozio.class);
        query.setParameter("regione",regione);
        return query.getResultList();
    }
    
    
        @Override
    public List<Negozio> findAll()
    {
        TypedQuery <Negozio> query = em.createNamedQuery("FINDALL",Negozio.class);
        return query.getResultList();
    }
    
    
    
    
    
    @Override
    public Negozio createNegozio(Negozio n)
    {
        em.persist(n);
        return n; //Aggiunto return
    }
    
    @Override
    public Negozio updateNegozio(Negozio n)
    {
        em.merge(n);
        return n; //Aggiunto return
    }
    
    @Override
    public void deleteNegozio(Negozio n)
    {
        em.remove(em.merge(n));
    }

    @Override
    public List<Negozio> findActiveShops() {
        TypedQuery <Negozio> query = em.createNamedQuery("FINDACTIVESHOPS",Negozio.class);
        return query.getResultList();
    }

            
}
