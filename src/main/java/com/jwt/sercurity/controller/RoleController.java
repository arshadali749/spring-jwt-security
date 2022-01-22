package com.jwt.sercurity.controller;

import com.jwt.sercurity.dto.ResponseDto;
import com.jwt.sercurity.model.Role;
import com.jwt.sercurity.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @PostMapping("/")
    public Role create(@RequestBody Role role) {
        Role roleFetched = roleService.create(role);
        return roleFetched;

    }

    @GetMapping("/{id}")
    public Role getById(int id) {
        Role roleFetched = roleService.getById(id);
        return roleFetched;

    }

    @DeleteMapping("/{id}")
    public ResponseDto deleteById(int id) {
        Role fetchedById = getById(id);
        ResponseDto roleFetched = roleService.deleteById(id);
        ResponseDto response = new ResponseDto();
        response.setObject(fetchedById);
        response.setDescription("Deleted ");
        return response;


    }

    @GetMapping("/")
    public List<Role> getAll() {
        List<Role> rolesFetched = roleService.getAll();
        return rolesFetched;

    }

    @PutMapping("/")
    public ResponseDto update(@RequestBody Role role) {
        ResponseDto updatedRole = roleService.update(role);
        return new ResponseDto(updatedRole, "Updated");


    }
}
