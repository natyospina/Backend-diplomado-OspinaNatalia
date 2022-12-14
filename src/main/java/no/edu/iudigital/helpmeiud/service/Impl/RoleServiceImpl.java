package no.edu.iudigital.helpmeiud.service.Impl;


import no.edu.iudigital.helpmeiud.model.Role;
import no.edu.iudigital.helpmeiud.repository.IroleRepository;
import no.edu.iudigital.helpmeiud.service.Iface.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private IroleRepository roleRepository;

    @Override
    public List<Role> getAll(){
        return roleRepository.findAll();
    }
}
