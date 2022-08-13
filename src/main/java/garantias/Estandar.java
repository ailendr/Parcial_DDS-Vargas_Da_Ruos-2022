package garantias;

public class Estandar extends Garantia{
  @Override
  public int duracion(){
    return 2* getProducto().getFactorDeImportancia;
  }
}
