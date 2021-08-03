package ru.astronarh;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class CountryMusic implements Music {
    private static final List<String> songs = List.of("Country song 1", "Country song 2", "Country song 3");

    @Override
    public String getSong() {
        return songs.get(new Random().nextInt(songs.size()));
    }
}
