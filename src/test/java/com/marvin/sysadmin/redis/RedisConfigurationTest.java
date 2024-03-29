package com.marvin.sysadmin.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisConfigurationTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void redisTemplate() throws Exception {

        redisTemplate.opsForValue().set("author", "marvin");
    }

}