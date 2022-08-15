package compra;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table
public class Tarjeta extends MedioDePago{
    @Column(name = "numero")
    private int numero;
    @Column(name = "nombre")
    private String nombre;
    @Column (name = "codigoDeSeguridad")
    private int codigoDeSeguridad;
    @Column(name = "fechaDeVencimiento", columnDefinition = "DATE")
    private LocalDate fechaDeVencimiento;

    public Tarjeta(int numero, String nombre, int codigoDeSeguridad, LocalDate fechaDeVencimiento) {
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

    public void verificarFechaVencimiento(LocalDate fecha){
        if(fechaDeVencimiento.isAfter(fecha)){
            throw new RuntimeException("La tarjeta está vencida");
        }
    }
}
