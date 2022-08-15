package garantias;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("daniosA")
public class CoberturaDaniosAccidentales extends ClaseDeco{
    private final boolean perdidaDeAccesorios = false;
    private final boolean deterioro = false;
    private final boolean destruccionTotal = true;
}
