package productos;

import db.EntidadPersistente;
import garantias.Garantia;

public abstract class CreadorProducto extends EntidadPersistente {

    public void visualizarGarantia(){
        Producto producto = crearProducto();
        producto.visualizarGarantia();
    }
    public void adquirirNuevaGarantia(Garantia nuevaGarantia){
        Producto producto = crearProducto();
        producto.adquirirNuevaGarantia(nuevaGarantia);
    }

    public void solicitarService(Servicio servicioNuevo){
        Producto producto = crearProducto();
        producto.solicitarService(servicioNuevo);
    }
    
    public abstract Producto crearProducto();
}
