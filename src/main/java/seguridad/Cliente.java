package seguridad;

import validacionMail.ServicioApi;
import validacionMail.entities.Mail;

import java.io.IOException;

public class Cliente extends Usuario{
    private String mail;
    private String mailARegistrar;


    public String getMail() {
        return mail;
    }

    @Override
    public void validarDatos(){
        super.validarDatos();
        RepoUsuarios repoDeUsuarios = new RepoUsuarios();
        //de la lista de clientes, obtenemos una lista de los mails y verificar que exista este mail en esa lista

    }
    @Override
    public boolean esCliente(){ return true;}

    public void darDeAltaUsuario() throws IOException {
        validarMail(mailARegistrar);
        validarContrasenia(this.getNuevaContrasenia());
    }

    private void validarMail(String mailARegistrar) throws IOException {
            ServicioApi servicioApi = ServicioApi.instancia();
            Mail nuevoMail = servicioApi.consultarMail(mailARegistrar);
            String spam = nuevoMail.getData().getSpam();
            if(spam.equals("true")){
                throw new RuntimeException("El mail ingresado es invalido, fallo su registro");
            }
        }
}
