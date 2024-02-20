package com.jjj.builder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 网关启动类
 *
 * @author jjj
 * @Date 2020-8-26
 */
@SpringBootApplication(scanBasePackages = {"com.jjj.builder"})
@EnableScheduling
public class SBApplication {

    public static void main(String[] args) {
        SpringApplication.run(SBApplication.class, args);
    }

}
