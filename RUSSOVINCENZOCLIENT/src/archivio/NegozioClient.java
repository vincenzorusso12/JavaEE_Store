package archivio;

import java.util.List;
import java.util.Scanner;
import javax.interceptor.Interceptors;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;



public class NegozioClient {
    
    
    public static void main(String[] args) throws NamingException{
    Context ctx = new InitialContext();
    NegozioEJBRemote ejb = (NegozioEJBRemote) ctx.lookup("java:global/RUSSOVINCENZOEJB/NegozioEJB!archivio.NegozioEJBRemote");
    Scanner in = new Scanner(System.in);
    System.out.println("Inserisci regione ");
    String regione = in.nextLine();
    List<Negozio> result = ejb.findByRegione(regione);
    for(Negozio n : result)
        {
        System.out.println(n);
        }
    }
    
}
