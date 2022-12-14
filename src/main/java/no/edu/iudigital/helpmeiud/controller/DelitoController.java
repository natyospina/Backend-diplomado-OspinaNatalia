package no.edu.iudigital.helpmeiud.controller;

import no.edu.iudigital.helpmeiud.dto.DelitoDTO;
import no.edu.iudigital.helpmeiud.service.Iface.IDelitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/delitos")
public class DelitoController {

    @Autowired
    private IDelitoService  delitoService;

    @GetMapping
    public ResponseEntity<List<DelitoDTO>> index(){
        return ResponseEntity
                .ok()
                .body(delitoService.findAll());
    }

}
