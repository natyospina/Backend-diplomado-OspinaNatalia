package no.edu.iudigital.helpmeiud.repository;


import no.edu.iudigital.helpmeiud.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IroleRepository extends JpaRepository<Role, Long>{
}
