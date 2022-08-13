package garantias;

import productos.Producto;

import java.util.Date;

public abstract class ClaseDeco extends Garantia {
    private Garantia garantiaBase;

    public ClaseDeco(String tipoDeGarantia, Date fechaDeAlta, float precio, Producto producto, int factor, Garantia garantiaBase) {
        super(tipoDeGarantia, fechaDeAlta, precio, producto, factor);
        this.garantiaBase = garantiaBase;
    }

    public void precioTotal() {
        Float precio = garantiaBase.getPrecio()+ this.getPrecio();
    }
}
