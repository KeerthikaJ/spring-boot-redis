package com.example.redis.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RedisProperties {
    private int redisPort;
    private String redisHost;
 
    public RedisProperties(
      @Value("${spring.redis.port}") int redisPort, 
      @Value("${spring.redis.host}") String redisHost) {
        this.redisPort = redisPort;
        this.redisHost = redisHost;
    }
 
    // getters
    public String getRedisHost() {
    	return redisHost;
    }
    
    public int getRedisPort() {
    	return redisPort;
    }
}
