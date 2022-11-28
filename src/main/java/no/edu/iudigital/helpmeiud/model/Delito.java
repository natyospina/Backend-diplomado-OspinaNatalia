package no.edu.iudigital.helpmeiud.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

import static lombok.AccessLevel.PRIVATE;

    @Entity
    @Table
    @Getter
    @Setter
    @FieldDefaults(level = PRIVATE)
    public class Delito {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) //Coloca los campos como privados
        long id;

        @Column(name ="nombre", nullable = false)
        String nombre;

        String descripcion;

        //Si quiero llevar un registro de quién creó este registro
        @ManyToOne
        @JoinColumn(name = "usuarios_id")
        Usuario usuario;
    }
