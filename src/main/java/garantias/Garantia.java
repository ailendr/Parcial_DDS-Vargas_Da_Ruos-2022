package garantias;

import productos.Producto;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/*@Entity*/
public abstract class Garantia {
    private String tipoDeGarantia;
    private Date fechaDeAlta;
    private float precio;
    private Producto producto;
    private int factor;
/*
    public Garantia(String tipoDeGarantia, Date fechaDeAlta, float precio, Producto producto) {
        this.tipoDeGarantia = tipoDeGarantia;
        this.fechaDeAlta = fechaDeAlta;
        this.precio = precio;
        this.producto = producto;
    }
*/
    public Calendar fechaDeFin() {
        Calendar calendar = Calendar.getInstance();
        calendar.setLenient(false);

        calendar.setTime(fechaDeAlta);
        calendar.add(calendar.MONTH, this.duracion());
        return calendar;
    }


    public int duracion() {
        return factor * producto.getFactorDeImportancia();
    }

    ;


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

    public int getFactor() {
        return factor;
    }
}


  /*public Garantia mostrarDatos() {
  //todo
      return 0;  }
}
*
   */
