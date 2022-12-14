package no.edu.iudigital.helpmeiud.service.Iface;

import no.edu.iudigital.helpmeiud.dto.CasoDTO;
import no.edu.iudigital.helpmeiud.dto.DelitoDTO;

import java.util.List;

public interface IDelitoService {
    //consultar todos los delitos
    public List<DelitoDTO> findAll(); //TODO: Lanzar excepción personalizada

    //Guardar un delito
    public DelitoDTO save(DelitoDTO delitoDTO);//TODO: Lanzar excepción personalizada
    //Activar/inactivar un caso
    //TODO: Lanzar excepción personalizada
    public Boolean visible(Boolean visible, Long id);
    //Listar un delito por ID
    //TODO: Lanzar excepción personalizada
    public DelitoDTO findById(Long id);

    //Borrar un delito
    public void delete(Long id); //TODO: Lanzar excepción personalizada

}
