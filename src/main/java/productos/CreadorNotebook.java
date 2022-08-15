package productos;

import garantias.Garantia;

public class CreadorNotebook extends CreadorProducto{
        @Override
        public Producto crearProducto(){
            return new Notebook( 0,null, null, null, 0, null, null, 0);
        }
}
