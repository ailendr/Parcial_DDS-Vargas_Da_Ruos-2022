package garantias;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("coberRPantalla")
public class CoberturaRoturaDePantalla extends ClaseDeco {
    private final int ocurrencias = 2;
    private final boolean display = true;
}
