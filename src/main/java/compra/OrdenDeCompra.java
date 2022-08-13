package compra;

import garantias.Garantia;
import productos.Producto;
import productos.Propietario;

import java.util.Date;

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
}
