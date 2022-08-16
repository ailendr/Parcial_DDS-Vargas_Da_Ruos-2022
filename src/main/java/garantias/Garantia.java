package garantias;

import db.EntidadPersistente;
import db.LocalDateAttributeConverter;
import productos.Producto;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

@Entity
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)

public abstract class Garantia extends EntidadPersistente {
    @Column(name = "nombreGarantia")
    private String nombreGarantia;

    @Column(name = "fechaDeAlta", columnDefinition = "DATE")
    private LocalDate fechaDeAlta;

    @Column(name = "precio")
    private float precio;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "id_producto")
    private Producto producto;
    @Transient
    private int factor;


    public LocalDate fechaDeFin() {
        return fechaDeAlta.plusMonths(this.duracion());
    }


    public int duracion() {
        return this.getFactor()* producto.getFactorDeImportancia();
    }

    public boolean estaVigente() {
        LocalDate fechaActual = LocalDate.now();
        return fechaActual.isAfter(fechaDeFin());
    }

    public String getTipoDeGarantia() {
        return nombreGarantia;
    }

    public void setTipoDeGantia(String tipoDeGarantia) {
        this.nombreGarantia = tipoDeGarantia;
    }

    public LocalDate getFechaDeAlta() {
        return fechaDeAlta;
    }

    public float getPrecio() {
        return precio;
    }

    public Producto getProducto() {
        return producto;
    }


    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public  int getFactor(){return factor;}

  /*Es un metodo boton pero nos ayuda a cumplir con el requerimiento no funcional*/
  public void mostrarDatos() {
        System.out.println("Nombre de garantía" + nombreGarantia);
        System.out.println("Fecha de alta:" + fechaDeAlta);
        System.out.println("Estado:" + this.estaVigente());
        System.out.println("Fecha de vencimiento" + this.fechaDeFin());
        System.out.println("Duracion:" + this.duracion());


      }


}



