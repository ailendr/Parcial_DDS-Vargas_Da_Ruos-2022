package garantias;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("premiumBasico")
public class PremiumBasico extends Garantia{
    private final int porcenCoberPorDanio=25;
    private final int factor=3;

}

