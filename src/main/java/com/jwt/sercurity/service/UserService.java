package com.jwt.sercurity.service;

import com.jwt.sercurity.dto.ResponseDto;
import com.jwt.sercurity.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public void intiRolesAndUsers();
    public User create(User user);
    public User updateUser(User user);
    public User getById(int id);
    public ResponseDto deleteById(int id);
}
