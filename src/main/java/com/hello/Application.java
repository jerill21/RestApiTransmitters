package com.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hello.domain.Transmitter;
import com.hello.domain.TransmitterRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class Application implements CommandLineRunner {

    private TransmitterRepository repository;

    @Autowired
    public void setRepository(TransmitterRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... arg0) throws Exception {
//
//        repository.deleteAll();
//
//        repository.save(new Hub(1, "122", "Hub1"));
//        repository.save(new Hub(2, "123", "Hub2"));
    }
}