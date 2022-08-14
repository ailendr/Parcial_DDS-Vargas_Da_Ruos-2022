package garantias;

import productos.Producto;

import java.util.Date;

public class PremiumIntermedio extends Garantia{
    private int porcenCoberPorDanio;

    public PremiumIntermedio(String tipoDeGarantia, Date fechaDeAlta, float precio, Producto producto) {
        super(tipoDeGarantia, fechaDeAlta, precio, producto);
    }
}

