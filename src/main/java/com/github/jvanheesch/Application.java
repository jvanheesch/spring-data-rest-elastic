package com.github.jvanheesch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application {
    @Autowired
    private NotitieRepository notitieRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    public void setup() {
        Notitie notitie = new Notitie();
        notitie.setId(1L);
        notitie.setTekst("example");
        notitieRepository.save(notitie);
    }
}
