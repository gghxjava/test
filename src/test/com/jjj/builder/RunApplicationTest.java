package com.jjj.builder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;


@SpringBootTest
@RunWith(SpringRunner.class)
public class RunApplicationTest {
    @Resource
    private RedissonClient redissonClient;

    @Test
    public void test() {
    }

}
