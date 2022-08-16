package seguridad;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RepoUsuarios {
    private List<Usuario> usuarios;
    private static RepoUsuarios instancia = null;

    public static RepoUsuarios instancia() {
        if (instancia == null) {
            instancia = new RepoUsuarios();
        }
        return instancia;
    }

    public void agregarUsuarios(Usuario...usuarios) {
        Collections.addAll(this.usuarios, usuarios);
    }

    public boolean consultarPorUser(String nombreUsuario) {
        Optional<Usuario> optional = usuarios.stream().filter(m -> m.getUser().equals(nombreUsuario)).findFirst();
        return optional.isPresent();
    }

    public boolean consultarMail (String direccionMail){
        Optional<Usuario> optional = usuarios.stream().filter(m -> m.getMail().equals(direccionMail)).findFirst();
        return optional.isPresent();
    }

}
