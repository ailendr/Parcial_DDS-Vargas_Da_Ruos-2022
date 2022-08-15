package productos;

import db.EntidadPersistente;
import garantias.Garantia;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "producto")
public abstract class Producto extends EntidadPersistente {

  @Column
 private int codigo;
  @Column
 private String modelo;

  @Transient
 private Garantia garantia;

@Transient
 private Propietario propietario;

 @Column
 private int factorDeImportancia;

 @Transient
 private String color;


    public Producto(int codigo, String modelo, Garantia garantia, Propietario propietario, int factorDeImportancia) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.garantia = garantia;
        this.propietario = propietario;
        this.factorDeImportancia = factorDeImportancia;
    }
/*
    public Garantia visualizarGarantia() {
   return garantia.mostrarDatos();
    }*/
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
