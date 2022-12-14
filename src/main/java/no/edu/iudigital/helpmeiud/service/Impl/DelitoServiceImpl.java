package no.edu.iudigital.helpmeiud.service.Impl;

import no.edu.iudigital.helpmeiud.dto.DelitoDTO;
import no.edu.iudigital.helpmeiud.model.Delito;
import no.edu.iudigital.helpmeiud.repository.IDelitoRepository;
import no.edu.iudigital.helpmeiud.service.Iface.IDelitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DelitoServiceImpl implements IDelitoService {

    @Autowired
    private final IDelitoRepository delitoRepository;
    public DelitoServiceImpl(IDelitoRepository delitoRepository){
        this.delitoRepository= delitoRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<DelitoDTO> findAll() {
        List<Delito> delitos = delitoRepository.findAll();
        //Todo: refactoring a un mapper en paquete util
        return delitos.stream().map(d ->
            DelitoDTO.builder()
                    .id(d.getId())
                    .nombre(d.getNombre())
                    .descripcion(d.getDescripcion())
                    .build()
            ).collect(Collectors.toList());
        }

    @Override
    public DelitoDTO save(DelitoDTO delitoDTO) {
        return null;
    }

    @Override
    public Boolean visible(Boolean visible, Long id) {
        return null;
    }

    @Override
    public DelitoDTO findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
