package com.sparta.week04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication // Hey, Java! This APP use Spring Boot framework!
@EnableJpaAuditing // 시간 자동 변경이 가능하도록 설정
@EnableScheduling
// Scheduling is willing to activated in Spring Boot
// Do not interrupt me!
public class Week04Application {

    public static void main(String[] args) {
        SpringApplication.run(Week04Application.class, args);
    }

}
