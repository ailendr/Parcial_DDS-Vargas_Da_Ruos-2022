package seguridad;

public abstract class Usuario {
    private String user;
    private String contrasenia;

    public String getUser() {
        return user;
    }
    public void iniciarSesion(){
        validarDatos();
        validarContrasenia();

    }

    public void validarContrasenia(){
        //TODO
    } ;

    public abstract void validarDatos() ;

    public abstract boolean esCliente();
}
