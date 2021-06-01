package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {
    @Autowired
    ApiService apiService;

    @Test
    public void testGetUsers(){
        List<User> users = apiService.geyUsers(3);
        Assert.assertEquals(4, users.size());
    }
}