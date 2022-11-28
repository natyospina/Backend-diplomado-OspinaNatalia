package no.edu.iudigital.helpmeiud.model;

import static lombok.AccessLevel.PRIVATE;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity // convierte en una entidad de hibernate
@Table(name="roles")
@Getter
@Setter
@FieldDefaults(level = PRIVATE)
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Coloca los campos como privados
    Long id;

    @Column(name = "nombre", length = 45, nullable = false)
    String nombre;

    String descripcion;

    //Bidireccional
    @ManyToMany(mappedBy = "roles") //Opcional
    List<Usuario> usuarios;
}
