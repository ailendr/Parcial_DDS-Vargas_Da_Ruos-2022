package garantias;

import productos.Producto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("estandar")
public class Estandar extends Garantia {
  private final int factor = 2;
  private final float precio = 0;
}
