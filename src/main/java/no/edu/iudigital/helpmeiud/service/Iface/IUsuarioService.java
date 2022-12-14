package no.edu.iudigital.helpmeiud.service.Iface;

import no.edu.iudigital.helpmeiud.dto.UsuarioDTO;
import no.edu.iudigital.helpmeiud.model.Usuario;

import java.util.List;

public interface IUsuarioService {

    public List<UsuarioDTO> findAll();//TODO: Lanzar excepción personalizada

    public UsuarioDTO findById(Long id); //TODO: Lanzar excepción personalizada

    public UsuarioDTO save  (UsuarioDTO usuarioDTO);//TODO: Lanzar excepción personalizada

    public Usuario findByUsername(String name);//TODO: Lanzar excepción personalizada
}
