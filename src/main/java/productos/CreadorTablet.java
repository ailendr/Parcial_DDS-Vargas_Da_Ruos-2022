package productos;

public class CreadorTablet extends CreadorProducto{
    @Override
    public Producto crearProducto(){
        return new Tablet();
    }
}
