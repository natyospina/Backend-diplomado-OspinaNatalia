package no.edu.iudigital.helpmeiud.service.Iface;

import no.edu.iudigital.helpmeiud.dto.CasoDTO;

import java.util.List;

public interface ICasoService {
    //consultar todos los casos
    public List<CasoDTO> findAll();//TODO: Lanzar excepción personalizada
    //Crear un caso
        public CasoDTO save(CasoDTO CasoDTO);//TODO: Lanzar excepción personalizada
    //Activar/inactivar un caso
    //TODO: Lanzar excepción personalizada
    public Boolean visible(Boolean visible, Long id);
    //Consultar caso por ID
    //TODO: Lanzar excepción personalizada
    public CasoDTO findById(Long id);
}
