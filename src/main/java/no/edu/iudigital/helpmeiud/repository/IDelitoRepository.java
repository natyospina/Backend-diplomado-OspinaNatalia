package no.edu.iudigital.helpmeiud.repository;

import no.edu.iudigital.helpmeiud.model.Delito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDelitoRepository extends JpaRepository<Delito, Long>{
}
