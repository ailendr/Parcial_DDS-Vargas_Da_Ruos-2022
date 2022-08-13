package garantias;

import productos.Producto;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public abstract class Garantia {
  private String tipoDeGarantia;
  private Date fechaDeAlta;
  private float precio;
  private boolean vigente;
  private Producto producto;
  private int factor;


   public Date fechaDeFin() {
     Calendar calendar = Calendar.getInstance();
     calendar.setLenient(false);

     calendar.setTime(fechaDeAlta);
     calendar.add(calendar.MONTH, this.duracion());
   }

   public abstract int duracion();
    /* return 2* producto.getFactorDeImportancia;*/

   public boolean estaVigente(){
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


  public boolean isVigente() {
    return vigente;
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
