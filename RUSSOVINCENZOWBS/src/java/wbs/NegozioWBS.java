/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wbs;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


@WebService(serviceName = "NegozioWBS")//Ordine invertito
@Stateless()
public class NegozioWBS {
    
    
     @PersistenceContext(unitName = "EsamePU")
      private EntityManager em;

    
    //Altri meyodi non implementati 
     
    @WebMethod(operationName = "stampaTutti")
    public String stampaTutti() {//cambio valore di ritorno in String
         TypedQuery <Negozio> query = em.createNamedQuery("FINDALL",Negozio.class);
        List<Negozio> list= query.getResultList();
        String s="";//Concatenazione stringa
        
        for(Negozio n : list)
        {
        s=s+n.toString()+"\n";
        }
        
        return s;
        
    }
}
