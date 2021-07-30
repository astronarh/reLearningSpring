package ru.astronarh;

public class RockMusic implements Music {
    public void doMyInitRockMusic() {
        System.out.println("Doing my initialization RockMusic");
    }

    public void doMyDestroyRockMusic() {
        System.out.println("Doing my destruction RockMusic");
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
