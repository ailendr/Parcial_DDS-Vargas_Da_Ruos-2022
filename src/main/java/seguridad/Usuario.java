package seguridad;

public abstract class Usuario {
    private String user;
    private String contrasenia;
    private String nuevaContrasenia;

    public String getUser() {
        return user;
    }
    public void iniciarSesion(){
        validarDatos();
        validarContrasenia(nuevaContrasenia);
    }


    public void validarContrasenia(String nuevaContrasenia){
        if (!contrasenia.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=-])(?=\\S+$).{8,}$")) {
            throw new RuntimeException("La contrasenia es invalida");
        }
    }


    public abstract void validarDatos() ;

    public abstract boolean esCliente();

    protected String getNuevaContrasenia() {
        return nuevaContrasenia;
    }
}
