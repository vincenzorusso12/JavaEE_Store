package archivio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;


@Entity
@NamedQueries({
@NamedQuery(name="FINDALL", query="SELECT n FROM Negozio n"),
@NamedQuery(name="FINDBYID", query="SELECT n FROM Negozio n WHERE n.id=:id"),
@NamedQuery(name="FINDBYREGION", query="SELECT n FROM Negozio n WHERE n.regione=:regione"),
@NamedQuery(name="FINDACTIVESHOPS", query="SELECT n FROM Negozio n WHERE n.venditeCurr>n.venditePrec")

})
public class Negozio implements Serializable {

   public static final long serialVersionUID = 1L;
    @Id
    @NotNull
    private int id;
    
    @NotNull
    private String nome;
    
    private String direttore ;

    private int venditePrec;
    private int venditeCurr;
    private String città;
    private String provincia;
    private String regione;

    public Negozio() {}

    public Negozio(int id, String nome, String direttore, int venditePrec, int venditeCurr, String città, String provincia, String regione) {
        this.id = id;
        this.nome = nome;
        this.direttore = direttore;
        this.venditePrec = venditePrec;
        this.venditeCurr = venditeCurr;
        this.città = città;
        this.provincia = provincia;
        this.regione = regione;
    }

    @Override
    public String toString() {
        return "Negozio{" + "id=" + id + ", nome=" + nome + ", direttore=" + direttore + ", venditePrec=" + venditePrec + ", venditeCurr=" + venditeCurr + ", citt\u00e0=" + città + ", provincia=" + provincia + ", regione=" + regione + '}';
    }

 

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDirettore() {
        return direttore;
    }

    public int getVenditePrec() {
        return venditePrec;
    }

    public int getVenditeCurr() {
        return venditeCurr;
    }

    public String getCittà() {
        return città;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getRegione() {
        return regione;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDirettore(String direttore) {
        this.direttore = direttore;
    }

    public void setVenditePrec(int venditePrec) {
        this.venditePrec = venditePrec;
    }

    public void setVenditeCurr(int venditeCurr) {
        this.venditeCurr = venditeCurr;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setRegione(String regione) {
        this.regione = regione;
    }
    
   
    
}
