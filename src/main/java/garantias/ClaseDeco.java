package garantias;

import productos.Producto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.util.Date;

@Entity
@DiscriminatorValue("garantiaEspecial")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class ClaseDeco extends Garantia {
    private Garantia garantiaBase;
/*
    public ClaseDeco(String tipoDeGarantia, Date fechaDeAlta, float precio, Producto producto, int factor, Garantia garantiaBase) {
        super(tipoDeGarantia, fechaDeAlta, precio, producto, factor);
        this.garantiaBase = garantiaBase;
    }
*/
    public float precioTotal() {
        return garantiaBase.getPrecio()+ this.getPrecio();
    }
}
