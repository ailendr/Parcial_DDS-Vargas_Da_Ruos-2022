package productos;

import java.util.List;

public class Propietario {
    private String nombre;
    private String apellido;
    private String dni;
    private List <Producto> productos;

    public Propietario(String nombre, String apellido, String dni, List<Producto> productos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.productos = productos;
    }
}

