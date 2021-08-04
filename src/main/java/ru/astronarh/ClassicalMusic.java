package ru.astronarh;

import java.util.List;
import java.util.Random;

public class ClassicalMusic implements Music {
    private static final List<String> songs = List.of("Classical song 1", "Classical song 2", "Classical song 3");

    @Override
    public String getSong() {
        return songs.get(new Random().nextInt(songs.size()));
    }
}
