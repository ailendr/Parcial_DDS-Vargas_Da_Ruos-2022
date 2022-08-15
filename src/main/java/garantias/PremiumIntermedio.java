package garantias;

import productos.Producto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;


@Entity
@DiscriminatorValue("premiumIntermedio")
public class PremiumIntermedio extends Garantia{
    private final int factor = 4;
    private final int porcenCoberPorDanio = 50;

}

