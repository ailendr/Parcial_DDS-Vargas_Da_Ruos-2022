package productos;

public class CreadorCelular extends CreadorProducto{

    @Override
    public Producto crearProducto(){
        return new Celular(0,null,null,null,0,0, 0, false, null);
    }
}
