package productos;

public class CreadorTablet extends CreadorProducto{
    @Override
    public Producto crearProducto(){
        return new Tablet(0, null, null,null,0, false, false);
    }
}
