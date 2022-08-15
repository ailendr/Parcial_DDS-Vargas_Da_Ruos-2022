package garantias;

import productos.Producto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;
import java.util.Date;

@Entity
@DiscriminatorValue("estandar")
public class Estandar extends Garantia {
  @Transient
  private final int factor = 2;

}
