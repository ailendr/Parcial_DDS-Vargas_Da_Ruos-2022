package compra;

import java.util.Date;

public class Tarjeta extends MedioDePago {
    private int numero;
    private String nombre;
    private int codigoDeSeguridad;
    private Date fechaDeVencimiento;

    public Tarjeta(int numero, String nombre, int codigoDeSeguridad, Date fechaDeVencimiento) {
        this.numero = numero;
        this.nombre = nombre;
        this.codigoDeSeguridad = codigoDeSeguridad;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    @Override
    public void realizarPago(OrdenDeCompra orden){
        super.realizarPago(orden);
        verificarFechaVencimiento(orden.getFechaDeCompra());
    }

    public void verificarFechaVencimiento(Date fecha){
        if(fechaDeVencimiento.after(fecha)){
            throw new RuntimeException("La tarjeta está vencida");
        }
    }
}
