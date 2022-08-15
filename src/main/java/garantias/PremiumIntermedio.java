package garantias;

import productos.Producto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;
import java.util.Date;


@Entity
@DiscriminatorValue("premiumIntermedio")
public class PremiumIntermedio extends Garantia{
    @Transient
    private final int factor = 4;
    @Transient
    private final int porcenCoberPorDanio = 50;

}

