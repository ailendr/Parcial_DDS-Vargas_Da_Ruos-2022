package productos;

import garantias.Garantia;

public abstract class Producto {
 private int codigo;
 private String modelo;
 private Garantia garantia;
 private Propietario propietario;
 private int factorDeImportancia;

 private String color;


    public Producto(int codigo, String modelo, Garantia garantia, Propietario propietario, int factorDeImportancia) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.garantia = garantia;
        this.propietario = propietario;
        this.factorDeImportancia = factorDeImportancia;
    }

    public Garantia visualizarGarantia() {
   return garantia.mostrarDatos();
    }
    public void adquirirNuevaGarantia(Garantia nuevagarantia){
        garantia = nuevagarantia;
    }
    public void solicitarService(){
        //todo
    }

    public int getFactorDeImportancia() {
        return factorDeImportancia;
    }

  public Propietario getPropietario() {
    return propietario;
  }
}
