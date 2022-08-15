package compra;

import garantias.Garantia;

import javax.persistence.Entity;

/*@Entity*/
/*@Table*/
public class MercadoPago extends  MedioDePago {
    /*@Column(name = "usuario") */
    private String usuario;
    /*@Column(name="dni") */
    private String dni;

    public MercadoPago(String usuario, String dni) {
        this.usuario = usuario;
        this.dni = dni;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    @Override
    public void realizarPago(OrdenDeCompra orden){
        super.realizarPago(orden);
        verificarUsuario(orden.getPropietario().getDni());
    }

    public void verificarUsuario(String dniPropietario){
        if(!dni.equals(dniPropietario)){
            throw new RuntimeException("Usuario inválido. Verificar dni");
        }
    }
}
