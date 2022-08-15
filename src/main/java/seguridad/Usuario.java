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


    public void validarDatos() {
        validarUsuarioExistente(user);
    }

    private void validarUsuarioExistente(String user) {
        RepoUsuarios repoUsuarios = RepoUsuarios.instancia();
       if(!repoUsuarios.consultarPorUser(user)){
           throw new RuntimeException("El usuario ingresado no existe");
       };
    }

    ;

    public abstract boolean esCliente();

    protected String getNuevaContrasenia() {
        return nuevaContrasenia;
    }
}
