package garantias;

import productos.Producto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;


@Entity
@DiscriminatorValue("premiumCompleto")
public class PremiumCompleto extends Garantia{
    private final int porcenCoberPorDanio=75;
    private final int factor=5;

}
