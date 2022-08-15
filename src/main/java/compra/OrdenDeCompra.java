package compra;

import garantias.Garantia;
import productos.Producto;
import productos.Propietario;

import javax.persistence.Entity;
import java.util.Date;

/*@Entity*/
public class OrdenDeCompra {
    private Garantia garantia;
    private Producto producto;
    private MedioDePago medioDePago;
    private Date fechaDeCompra;

    public Propietario getPropietario(){
        return producto.getPropietario();
    }

    public void pagar(){
        medioDePago.realizarPago(this);
    }

    public Date getFechaDeCompra() {
        return fechaDeCompra;
    }

    public Garantia getGarantia() {
        return garantia;
    }
}
