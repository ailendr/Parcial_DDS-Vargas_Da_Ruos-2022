package productos;

import garantias.Garantia;

public abstract class CreadorProducto {

    public void visualizarGarantia(){
        Producto producto = crearProducto();
        /*producto.visualizarGarantia();*/
    }
    public void adquirirNuevaGarantia(Garantia nuevaGarantia){
        Producto producto = crearProducto();
        producto.adquirirNuevaGarantia(nuevaGarantia);
    }

    public void solicitarService(){
        Producto producto = crearProducto();
        producto.solicitarService();
    }
    
    public abstract Producto crearProducto();
}
