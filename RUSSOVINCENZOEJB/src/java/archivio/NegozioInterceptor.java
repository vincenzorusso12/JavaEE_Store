package archivio;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;


@Interceptor
@InterfaceInterceptor
public class NegozioInterceptor {//Rimosso implements e aggiunto @InterfaceInterceptor
    private int count = 0;
    @AroundInvoke
    public Object logMethod(InvocationContext ic) throws Exception{//Aggiunto throws Exception
    try
    {
    if(ic.getMethod().getName().equals("findByRegione"))
        {
        count++;
        }
    return ic.proceed();
    }
    finally{
    System.out.println("Il metodo stampa regione è stato chiamato: "+count+" volte");
    }
    }//Rimosso catch
}
