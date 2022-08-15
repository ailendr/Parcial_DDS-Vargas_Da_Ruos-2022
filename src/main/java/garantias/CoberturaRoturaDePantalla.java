package garantias;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("coberRPantalla")
public class CoberturaRoturaDePantalla extends ClaseDeco {
    @Transient
    private final int ocurrencias = 2;

    @Transient
    private final boolean display = true;
}
