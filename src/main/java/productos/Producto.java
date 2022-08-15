package productos;

import db.EntidadPersistente;
import garantias.Garantia;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public abstract class Producto extends EntidadPersistente {

  @Column(name = "codigo")
 private int codigo;
  @Column(name = "modelo")
 private String modelo;

  @Transient
 private Garantia garantia;

 @ManyToOne
 @JoinColumn(name = "id_Propietario", referencedColumnName = "id")
 private Propietario propietario;

 @Column(name ="factorDeImportancia")
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

    public void visualizarGarantia() {
      garantia.mostrarDatos();
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
