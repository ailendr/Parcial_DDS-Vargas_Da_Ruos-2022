package garantias;

import productos.Producto;

import java.util.Date;

public class Estandar extends Garantia{
  //private final int factor = 2;
  private final float precio=0;

  @Override
  public final int getFactor(){
    return 2;
  }
}
