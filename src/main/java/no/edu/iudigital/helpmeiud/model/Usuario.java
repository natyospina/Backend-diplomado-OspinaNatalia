package no.edu.iudigital.helpmeiud.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@FieldDefaults(level = PRIVATE)

public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Coloca los campos como privados
    Long id;

    @Column (name = "username",
            unique = true,
            length = 120,
            nullable = false)
    String username;

    @Column (name = "nombre", nullable = false, length = 120)
    String nombre;

    @Column(name = "apellido", length = 120)
    String apellido;

    @Column
    String password;

    @Column(name = "fecha_nacimiento")
    LocalDate fechaNacimiento;

    @Column
    Boolean enabled;

    @Column(name = "red_social")
    Boolean redSocial;

    @Column
    String image;

    //Hay una relación de muchos a muchos con usuarios
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "roles_usuarios",
            joinColumns = {@JoinColumn(name = "usuarios_id")},
            inverseJoinColumns = {@JoinColumn(name = "roles_id")})
    List<Role> roles;


}
