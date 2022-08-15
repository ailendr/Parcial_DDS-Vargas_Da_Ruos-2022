package productos;

import db.EntidadPersistente;

import javax.persistence.*;

@Entity
@Table(name = "servicio")

public class Servicio extends EntidadPersistente {
    @ManyToOne
    @JoinColumn(name = "id_producto",referencedColumnName = "id")
    private Producto producto;

    @Column(name = "motivo")
    private String motivo;
}
