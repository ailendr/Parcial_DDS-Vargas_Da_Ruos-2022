package seguridad;

import validacionMail.ServicioApi;
import validacionMail.entities.Mail;

import java.io.IOException;

public class Cliente extends Usuario{
    private String mailARegistrar;

    
public void setMailARegistrar(String mailaregistrar){
this.mailARegistrar=mailaregistrar;}

    @Override
    public void validarDatos(){
        super.validarDatos();
        RepoUsuarios repoDeUsuarios = new RepoUsuarios();
        if(!repoDeUsuarios.consultarMail(mailARegistrar)){
            throw new RuntimeException("Este mail no está registrado");
        }

    }

    public void darDeAltaUsuario() throws IOException {
        validarUsuarioDisponible (nuevoUser);
        validarMail(mailARegistrar);
        validarContrasenia(nuevaContrasenia);
        user = nuevoUser;
        mail = mailARegistrar;
        contrasenia = nuevaContrasenia;

    }

    private void validarUsuarioDisponible(String nuevoUser) {
        RepoUsuarios repoUsuarios = RepoUsuarios.instancia();
        if(repoUsuarios.consultarPorUser(nuevoUser)){
            throw new RuntimeException("El usuario ya existe, escoger otro nombre de usuario");
        }
    }


    private void validarMail(String mailARegistrar) throws IOException {
            ServicioApi servicioApi = ServicioApi.instancia();
            Mail nuevoMail = servicioApi.consultarMail(mailARegistrar);
            String spam = nuevoMail.getData().getSpam();
            if(spam.equals("true")){
                throw new RuntimeException("El mail ingresado es spam, fallo su registro");
            }
        RepoUsuarios repoDeUsuarios = new RepoUsuarios();
        if(repoDeUsuarios.consultarMail(mailARegistrar)){
            throw new RuntimeException("Este mail está registrado en el sistema, ingrese uno nuevo");
        }
        }
}
