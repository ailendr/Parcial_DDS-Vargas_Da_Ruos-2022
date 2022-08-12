package productos;

public class CreadorCelular extends CreadorProducto{
    @Override
    public Producto crearProducto(){
        return new Celular();
    }
}
