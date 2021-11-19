package org.iproute.redis0.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * RedisTest
 *
 * @author winterfell
 * @since 2021/11/17
 */
@Component
public class RedisTest implements CommandLineRunner {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void run(String... args) throws Exception {

        redisTemplate.opsForValue().set("hello", "world");
    }
}
