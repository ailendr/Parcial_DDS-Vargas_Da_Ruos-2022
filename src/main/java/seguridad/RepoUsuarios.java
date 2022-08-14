package seguridad;

import java.util.List;

public class RepoUsuarios {
    private List <Usuario> usuarios;
    private static RepoUsuarios instancia = null;

    public static RepoUsuarios instancia(){
        if(instancia== null){
            instancia = new RepoUsuarios();
        }
        return instancia;
    }

   /* public boolean consultarPorUser( String nombreUsuario) {
        //TODO
    }

    public List<Cliente> listaDeClientes(){
        //TODO


    }*/

}
