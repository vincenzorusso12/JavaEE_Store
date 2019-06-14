package archivio;

import java.util.List;
import java.util.Scanner;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class NegozioClient2 {
    public static void main(String[] args) throws NamingException{
    Context ctx = new InitialContext();
    NegozioEJBRemote ejb = (NegozioEJBRemote) ctx.lookup("java:global/RUSSOVINCENZOEJB/NegozioEJB!archivio.NegozioEJBRemote");
    System.out.println("Negozi in attivo ");
    List<Negozio> result = ejb.findActiveShops();
    for(Negozio n : result)
    {
        
        System.out.println(n);
        
    }
    }
    
}
