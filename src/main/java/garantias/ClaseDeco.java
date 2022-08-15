package garantias;

import productos.Producto;

import javax.persistence.*;
import java.util.Date;

@Entity
@DiscriminatorValue("garantiaEspecial")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class ClaseDeco extends Garantia {
    @Transient
    private Garantia garantiaBase;
    public float precioTotal() {
        return garantiaBase.getPrecio()+ this.getPrecio();
    }
}
