package ru.astronarh;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInitClassicalMusic() {
        System.out.println("Doing my initialization ClassicalMusic");
    }

    public void doMyDestroyClassicalMusic() {
        System.out.println("Doing my destruction ClassicalMusic");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
