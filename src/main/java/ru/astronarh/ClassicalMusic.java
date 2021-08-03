package ru.astronarh;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    private static final List<String> songs = List.of("Classical song 1", "Classical song 2", "Classical song 3");

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialisation");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return songs.get(new Random().nextInt(songs.size()));
    }
}
