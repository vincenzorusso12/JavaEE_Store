package archivio;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;


@DataSourceDefinition(

className = "org.apache.derby.jdbc.EmbeddedDataSource",//Corretto className
databaseName = "EsameDB",
name = "java:global/jdbc/EsameDS",
user = "APP",
password = "APP",
properties = {"connectionAttributes=;create=true"}//Completate properties
)
@Singleton //Aggiunto @Singleton e @Startup
@Startup
public class DBPopulator {
    @Inject
    private NegozioEJB ejb;
    private Negozio n1,n2,n3;
    
    @PostConstruct
    private void createDb()//Completato newNegozio e aggiunto un negozio in più
    {
       n1=new Negozio(1, "Expert", "Mario Rossi", 1000, 2000,"Salerno","SA", "Campania");
       n2=new Negozio(2, "Mediaworld", "Luca Bianchi", 2000, 1000,"Roma","RM", "Lazio");
       n3=new Negozio(3, "Trony", "Giovanni Verdi", 1000, 2000,"Milano","MI", "Lombardia");
       ejb.createNegozio(n1);
       ejb.createNegozio(n2);
    ejb.createNegozio(n3);
    }
    
    @PreDestroy
    private void clearDb()
    {
        ejb.deleteNegozio(n1);
         ejb.deleteNegozio(n2);
          ejb.deleteNegozio(n3);
    }
}
