package com.example.redis.configuration;

import static org.junit.Assert.assertNotNull;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.redis.model.User;
import com.example.redis.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestRedisConfiguration.class)
public class UserRepositoryIntegrationTest {
 
    @Autowired
    private UserRepository userRepository;
 
    @Test
    public void shouldSaveUser_toRedis() {
        UUID id = UUID.randomUUID();
        User user = new User(id, "name");
        System.out.println("hello");
        User saved = userRepository.save(user);
 
        assertNotNull(saved);
    }
}