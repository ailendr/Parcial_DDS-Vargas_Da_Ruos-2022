package compra;

public class MercadoPago extends  MedioDePago {
    private String usuario;
    private String contrasenia;

    public MercadoPago(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    @Override
    public void realizarPago(){
        //TODO
    }
}
