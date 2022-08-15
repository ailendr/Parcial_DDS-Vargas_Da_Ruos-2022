package productos;

import garantias.Garantia;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("notebook")
public class Notebook extends Producto{
    @Transient
    private String sistemaOperativo ;
    @Transient
    private String procesador;
    @Transient
    private int ram;

    public Notebook(int codigo, String modelo, Garantia garantia, Propietario propietario, int factorDeImportancia, String sistemaOperativo, String procesador, int ram) {
        super(codigo, modelo, garantia, propietario, factorDeImportancia);
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
        this.ram = ram;
    }

}
