package com.jwt.sercurity.serviceimpl;

import com.jwt.sercurity.dto.ResponseDto;
import com.jwt.sercurity.model.Role;
import com.jwt.sercurity.repo.RoleRepo;
import com.jwt.sercurity.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepo roleRepo;

    @Override
    public Role create(Role role) {
        return roleRepo.save(role);
    }

    @Override
    public Role getById(int id) {
        return roleRepo.getById(id);
    }

    @Override
    public ResponseDto deleteById(int id) {
        ResponseDto response = new ResponseDto();
        Role roleFetched = roleRepo.getById(id);
        roleRepo.deleteById(id);
        response.setObject(roleFetched);
        response.setDescription("User deleted successfully ");
        return response;

    }

    @Override
    public List<Role> getAll() {
        return roleRepo.findAll();
    }

    @Override
    public ResponseDto update(Role role) {
        return null;
    }
}
