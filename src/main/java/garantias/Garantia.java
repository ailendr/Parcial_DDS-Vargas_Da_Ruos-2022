package garantias;

import db.EntidadPersistente;
import productos.Producto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

@Entity
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)

public abstract class Garantia extends EntidadPersistente {
    @Column(name = "nombreGarantia")
    private String nombreGarantia;

    @Column (name = "fechaDeAlta") //DUDA
    private Date fechaDeAlta;
    @Column(name = "precio")
    private float precio;


    private Producto producto;
    @Column(name = "factor")
    private int factor;

    public Calendar fechaDeFin() {
        Calendar calendar = Calendar.getInstance();
        calendar.setLenient(false);

        calendar.setTime(fechaDeAlta);
        calendar.add(calendar.MONTH, this.duracion());
        return calendar;
    }


    public int duracion() {
        return this.getFactor()* producto.getFactorDeImportancia();
    }

    public boolean estaVigente() {
        Date fechaActual = new Date();
        return fechaDeFin().after(fechaActual);
    }

    public String getTipoDeGarantia() {
        return nombreGarantia;
    }

    public void setTipoDeGantia(String tipoDeGarantia) {
        this.nombreGarantia = tipoDeGarantia;
    }

    public Date getFechaDeAlta() {
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
        System.out.println("El tipo de garantia es" + nombreGarantia);
        System.out.println("La fecha de alta es" + fechaDeAlta);
        System.out.println("El estado de vigencia es:" + this.estaVigente());
      }




}



