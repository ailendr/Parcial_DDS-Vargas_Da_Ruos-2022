package productos;

import db.EntidadPersistente;
import garantias.Garantia;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public abstract class Producto extends EntidadPersistente {

  @Column(name = "codigo")
 private int codigo;

  @Column(name = "modelo")
 private String modelo;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "id_garantia")
 private Garantia garantia;

 @ManyToOne
 @JoinColumn(name = "id_Propietario", referencedColumnName = "id")
 private Propietario propietario;

 @Column(name ="factorDeImportancia")
 private int factorDeImportancia;

 @Transient
 private String color;

 @OneToMany(mappedBy = "producto", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
 private List<Servicio> servicios= new ArrayList<>();



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
    public void solicitarService(Servicio...servicios){
        Collections.addAll(this.servicios, servicios);

    }

    public int getFactorDeImportancia() {
        return factorDeImportancia;
    }

  public Propietario getPropietario() {
    return propietario;
  }
}
