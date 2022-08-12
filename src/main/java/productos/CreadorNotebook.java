package productos;

public class CreadorNotebook extends CreadorProducto{
        @Override
        public Producto crearProducto(){
            return new Notebook();
        }
}
