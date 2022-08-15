package compra;

import db.EntidadPersistente;
import garantias.Garantia;

public abstract  class MedioDePago extends EntidadPersistente {
    private Float saldo;

    public void realizarPago(OrdenDeCompra orden) {
        this.saldoSuficiente(orden.getGarantia().getPrecio());
    }

    public void saldoSuficiente(float precio){
        if(precio> saldo){
                throw new RuntimeException("No tiene saldo suficiente");
            }
        }

    }



