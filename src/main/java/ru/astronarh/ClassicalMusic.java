package ru.astronarh;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
import java.util.Set;

@Component
public class ClassicalMusic implements Music {
    private static final List<String> songs = List.of("Classical song 1", "Classical song 2", "Classical song 3");

    @Override
    public String getSong() {
        return songs.get(new Random().nextInt(songs.size()));
    }
}
