package com.stackroute.authenticationservice.repository;
import com.stackroute.authenticationservice.model.UserDao;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserDao, Integer> {
    UserDao findByUsername(String username);
}

