package no.edu.iudigital.helpmeiud.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;

import static lombok.AccessLevel.PRIVATE;

@Getter
@Setter
@FieldDefaults(level = PRIVATE)
@Builder
public class DelitoDTO {
    long id;
    String nombre;
    String descripcion;
}
