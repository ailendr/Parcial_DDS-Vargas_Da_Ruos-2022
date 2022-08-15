package productos;

import db.EntidadPersistente;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Propietario extends EntidadPersistente {
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "dni")
    private String dni;
    @OneToMany(mappedBy = "propietario", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List <Producto> productos;

    public Propietario(String nombre, String apellido, String dni, List<Producto> productos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.productos = productos;
    }

    public String getDni() {
        return dni;
    }
}

