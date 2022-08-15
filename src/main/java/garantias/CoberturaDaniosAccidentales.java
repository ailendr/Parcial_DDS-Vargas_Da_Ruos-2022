package garantias;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("daniosA")
public class CoberturaDaniosAccidentales extends ClaseDeco{
    @Transient
    private final boolean perdidaDeAccesorios = false;

    @Transient
    private final boolean deterioro = false;

    @Transient
    private final boolean destruccionTotal = true;
}
