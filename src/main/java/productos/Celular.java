package productos;

import garantias.Garantia;

public class Celular extends Producto{
    private int mpCamaraPrincipal;
    private int mpCamaraFrontal;
    private boolean flash;
    private String entradaCargador;

    public Celular(int codigo, String modelo, Garantia garantia, Propietario propietario, int factorDeImportancia, int mpCamaraPrincipal, int mpCamaraFrontal, boolean flash, String entradaCargador) {
        super(codigo, modelo, garantia, propietario, factorDeImportancia);
        this.mpCamaraPrincipal = mpCamaraPrincipal;
        this.mpCamaraFrontal = mpCamaraFrontal;
        this.flash = flash;
        this.entradaCargador = entradaCargador;
    }
}
