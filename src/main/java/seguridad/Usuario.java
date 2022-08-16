package seguridad;

public abstract class Usuario {
    protected String mail;
    protected String user;
    protected String nuevoUser;
   protected String contrasenia;
    protected String nuevaContrasenia;

    public String getUser() {
        return user;
    }
    public void setNuevoUser(String nuevoUser){
    this.nuevoUser = nuevoUser;
        }
    
    
    public void setNuevaContrasenia(String nuevaContrasenia){
    this.nuevaContrasenia = nuevaContrasenia;}
    
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


    public String getMail() {
        return mail;
    }
}
