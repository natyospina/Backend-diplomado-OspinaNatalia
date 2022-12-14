package no.edu.iudigital.helpmeiud.controller;

import no.edu.iudigital.helpmeiud.model.Role;
import no.edu.iudigital.helpmeiud.service.Iface.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private IRoleService roleService;

    @GetMapping
    public ResponseEntity<List<Role>> index (){
        List<Role> roles = roleService.getAll();
        return ResponseEntity.ok().body(roles);
    }
}
