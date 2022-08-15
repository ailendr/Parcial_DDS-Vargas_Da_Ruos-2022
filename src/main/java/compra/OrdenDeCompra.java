package compra;

import db.EntidadPersistente;
import garantias.Garantia;
import productos.Producto;
import productos.Propietario;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table
public class OrdenDeCompra extends EntidadPersistente {
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Garantia")
    private Garantia garantia;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Producto")
    private Producto producto;
    @Transient
    private MedioDePago medioDePago;
    @Column(name = "fechaDeCompra", columnDefinition = "DATE")
    private LocalDate fechaDeCompra;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Tarjeta")
    private Tarjeta tarjeta;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_MercadoPago")
    private MercadoPago mercadoPago;

    public Propietario getPropietario(){
        return producto.getPropietario();
    }

    public void pagar(){
        medioDePago.realizarPago(this);
    }

    public LocalDate getFechaDeCompra() {
        return fechaDeCompra;
    }

    public Garantia getGarantia() {
        return garantia;
    }
}
