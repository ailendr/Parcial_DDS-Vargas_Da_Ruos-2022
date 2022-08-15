package compra;

import db.EntidadPersistente;
import garantias.Garantia;
/*@Entity*/
/*@Table*/
public abstract  class MedioDePago extends EntidadPersistente {
    /*@Column(name = "saldo")*/
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



