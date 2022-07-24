package com.example.redditclone;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class RedditCloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedditCloneApplication.class, args);
    }

    @Bean
    ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
}
