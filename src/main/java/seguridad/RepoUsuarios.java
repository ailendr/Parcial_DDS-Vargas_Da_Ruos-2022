package seguridad;

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

    public boolean consultarPorUser(String nombreUsuario) {
        Optional<Usuario> optional = usuarios.stream().filter(m -> m.getUser().equals(nombreUsuario)).findFirst();
        return optional.isPresent();
    }

    public List<Cliente> listaDeClientes() {
        Stream<Usuario> optional = usuarios.stream().filter(m -> m.esCliente());

        Map<Cliente, String > mapa = optional.collect(Collectors.toMap(x -> x.getMail(), x -> x));

    }
}
