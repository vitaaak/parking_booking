package com.kurgan.kursach.service;

import com.kurgan.kursach.models.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceImplTest {

    @Autowired
    UserService userService;

    @Test
    public void findAll() {
        List<User> user = userService.findAll();
        Assert.assertNotNull(user);
    }

    @Test
    public void findByUsername() {
        User user = userService.findByUsername("vito44ka");
        Assert.assertNotNull(user);
    }

}


