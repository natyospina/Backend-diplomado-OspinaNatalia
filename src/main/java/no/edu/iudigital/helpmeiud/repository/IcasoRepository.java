package no.edu.iudigital.helpmeiud.repository;

import no.edu.iudigital.helpmeiud.model.Caso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IcasoRepository extends JpaRepository<Caso, Long> {
}
