package no.edu.iudigital.helpmeiud.service.Impl;

import no.edu.iudigital.helpmeiud.dto.CasoDTO;
import no.edu.iudigital.helpmeiud.model.Caso;
import no.edu.iudigital.helpmeiud.repository.IcasoRepository;
import no.edu.iudigital.helpmeiud.service.Iface.ICasoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CasoServiceImpl implements ICasoService {
    private final IcasoRepository casoRepository;

    @Autowired
    public CasoServiceImpl(IcasoRepository casoRepository){
        this.casoRepository = casoRepository;
    }
    @Transactional(readOnly = true)
    @Override
    public List<CasoDTO> findAll() {
        List<Caso> casos = casoRepository.findAll();
        // TODO: Refactoring a un mapper en paquete util
        return casos.stream().map(d ->
                CasoDTO.builder()
                        .id(d.getId())
                        .fechaHora(d.getFechaHora())
                        .latitud(d.getLatitud())
                        .longitud(d.getLongitud())
                        .altitud(d.getAltitud())
                        .visible(d.getVisible())
                        .descripcion(d.getDescripcion())
                        .urlMap(d.getUrlMap())
                        .rmiUrl(d.getRmiUrl())
                        .build()
        ).collect(Collectors.toList());
    }

    @Override
    public CasoDTO save(CasoDTO CasoDTO) {
        return null;
    }

    @Override
    public Boolean visible(Boolean visible, Long id) {
        return null;
    }

    @Override
    public CasoDTO findById(Long id) {
        return null;
    }

}