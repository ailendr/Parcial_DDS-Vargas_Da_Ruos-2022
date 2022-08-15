package garantias;

import productos.Producto;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/*@Entity*/
public abstract class Garantia {
   // @Column(name = "tipoDeGarantia")
    private String tipoDeGarantia;
    private Date fechaDeAlta;
    //@Column(name = "precio")
    private float precio;


    private Producto producto;
    //@Column(name = "factor")
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
        return tipoDeGarantia;
    }

    public void setTipoDeGantia(String tipoDeGarantia) {
        this.tipoDeGarantia = tipoDeGarantia;
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

    public abstract int getFactor();

  public void mostrarDatos() {
        System.out.println("El tipo de garantia es" + tipoDeGarantia);
        System.out.println("La fecha de alta es" + fechaDeAlta);
        System.out.println("El estado de vigencia es:" + this.estaVigente());
        System.out.println("El precio de la garantia es:" + precio);
      }



}



