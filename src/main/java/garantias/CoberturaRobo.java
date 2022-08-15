package garantias;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("coberturaRobo")
public class CoberturaRobo extends ClaseDeco{
    private String zonaCobertura;
}
