package ru.astronarh;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {
    private static final List<String> songs = List.of("Rock song 1", "Rock song 2", "Rock song 3");

    @Override
    public String getSong() {
        return songs.get(new Random().nextInt(songs.size()));
    }
}
