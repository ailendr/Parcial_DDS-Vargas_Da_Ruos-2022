package productos;

import garantias.Garantia;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("celular")
public class Celular extends Producto{
    @Transient
    private int mpCamaraPrincipal;
    @Transient
    private int mpCamaraFrontal;
    @Transient
    private boolean flash;
    @Transient
    private String entradaCargador;

    public Celular(int codigo, String modelo, Garantia garantia, Propietario propietario, int factorDeImportancia, int mpCamaraPrincipal, int mpCamaraFrontal, boolean flash, String entradaCargador) {
        super(codigo, modelo, garantia, propietario, factorDeImportancia);
        this.mpCamaraPrincipal = mpCamaraPrincipal;
        this.mpCamaraFrontal = mpCamaraFrontal;
        this.flash = flash;
        this.entradaCargador = entradaCargador;
    }
}
