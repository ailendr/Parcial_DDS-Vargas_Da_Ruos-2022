package productos;

import garantias.Garantia;

public abstract class CreadorProducto {

    public void visualizarGarantia(){
        Producto producto = crearProducto();
        producto.visualizarGarantia();
    }
    public void adquirirNuevaGarantia(Garantia nuevaGarantia){
        Producto producto = crearProducto();
        /*roducto.adquirirNuevaGarantia(Garantia nuevaGarantia);*/
    }

    
    public abstract Producto crearProducto();
}
