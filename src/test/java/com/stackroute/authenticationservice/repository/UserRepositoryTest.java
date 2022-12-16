package com.stackroute.authenticationservice.repository;

import com.stackroute.authenticationservice.model.UserDao;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserRepository userRepository;

    public UserRepositoryTest() {
    }

    @BeforeEach
    public void setUp(){
        userDao = new UserDao();
        userDao.setUsername("test@gmail.com");
        userDao.setPassword("test123");
    }

    @AfterEach
    public void tearDown(){
        userRepository.deleteAll();
        userDao = null;
    }

    @Test
    public void givenCredentialsShouldSaveTheCredentials(){
        userRepository.save(userDao);
        UserDao savedUser = userRepository.findByUsername("test@gmail.com");
        assertEquals("test@gmail.com",savedUser.getUsername());
    }

}
