package no.edu.iudigital.helpmeiud.repository;

import no.edu.iudigital.helpmeiud.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario, Long> {
    public Usuario findByUsername(String username);
}
