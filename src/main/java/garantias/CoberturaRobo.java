package garantias;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("coberturaRobo")
public class CoberturaRobo extends ClaseDeco{
    @Transient
    private String zonaCobertura;
}
