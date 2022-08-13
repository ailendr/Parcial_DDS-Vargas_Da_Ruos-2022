package productos;

import garantias.Garantia;

public class Tablet extends Producto{
   private boolean teclado;
   private boolean lapizTactil;

    public Tablet(int codigo, String modelo, Garantia garantia, Propietario propietario, int factorDeImportancia, boolean teclado, boolean lapizTactil) {
        super(codigo, modelo, garantia, propietario, factorDeImportancia);
        this.teclado = teclado;
        this.lapizTactil = lapizTactil;
    }
}
