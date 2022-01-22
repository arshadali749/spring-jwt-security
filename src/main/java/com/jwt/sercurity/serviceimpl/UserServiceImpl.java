package com.jwt.sercurity.serviceimpl;

import com.jwt.sercurity.dto.ResponseDto;
import com.jwt.sercurity.model.Role;
import com.jwt.sercurity.model.User;
import com.jwt.sercurity.repo.UserRepo;
import com.jwt.sercurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;

    @Override
    public void intiRolesAndUsers() {

        User adminUser = new User();
        adminUser.setFirstName("arshad");
        adminUser.setLastName("ali");
        adminUser.setPassword("123");
        adminUser.setUserName("abc");
        Role adminRole = new Role();

        adminRole.setName("ADMIN");
        Set<Role> adminRoles = new HashSet<Role>();
        adminRoles.add(adminRole);
        adminUser.setRoles(adminRoles);
        User user = new User();
        user.setFirstName("Ahmed");
        user.setLastName("Ali");
        user.setUserName("abc");
        user.setPassword("123");
        Set<Role> userRoles = new HashSet<Role>();
        Role userRole = new Role();
        userRole.setName("USER");
        userRoles.add(userRole);
        user.setRoles(userRoles);
        userRepo.save(user);
        userRepo.save(adminUser);
    }

    @Override
    public User create(User user) {
        return userRepo.save(user);
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public User getById(int id) {
        return userRepo.getById(id);
    }

    @Override
    public ResponseDto deleteById(int id) {
        User fetchedById = getById(id);
        userRepo.deleteById(id);
        return new ResponseDto(fetchedById, "User Deleted");
    }
}
