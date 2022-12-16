package com.stackroute.authenticationservice.service;

import com.stackroute.authenticationservice.model.UserDao;
import com.stackroute.authenticationservice.model.UserDto;
import com.stackroute.authenticationservice.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ServiceTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserDao userDao;
    UserDto userDto;
    JwtUserDetailsService jwtUserDetailsService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        userDao = new UserDao();
        userDao.setUsername("root");
        userDao.setPassword("root123");
    }

    public void tearDown(){
        userDao = null;
    }

    @Test
    public void givenUserToSaveThenShouldReturnSavedUser(){
        when(userRepository.save(any())).thenReturn(userDao);
        assertEquals(userDao, jwtUserDetailsService.save(userDto));
        verify(userRepository, times(1)).save(any());

    }
}
