package com.jwt.sercurity.repo;

import com.jwt.sercurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
}
