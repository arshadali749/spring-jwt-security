package com.jwt.sercurity.service;

import com.jwt.sercurity.dto.ResponseDto;
import com.jwt.sercurity.model.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {
    public Role create(Role role);
    public Role getById(int id);
    public ResponseDto deleteById(int id);
    public List<Role> getAll();
    public ResponseDto update(Role role);

}
