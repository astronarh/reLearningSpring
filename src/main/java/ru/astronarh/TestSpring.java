package ru.astronarh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);

        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);

        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println(classicalMusic1.getSong());

        System.out.println(rockMusic.getSong());

        System.out.println(classicalMusic2.getSong());

//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean compare = musicPlayer1 == musicPlayer2;
//
//        System.out.println(compare);
//
//        System.out.println(musicPlayer1);
//        System.out.println(musicPlayer2);
//
//        musicPlayer1.setVolume(10);
//
//        System.out.println(compare);
//
//        System.out.println(musicPlayer1);
//        System.out.println(musicPlayer2);
//
//        musicPlayer1.playMusic();
//        System.out.println("Name: " + musicPlayer1.getName() + ", volume: " + musicPlayer1.getVolume());
//
//        musicPlayer2.playMusic();
//        System.out.println("Name: " + musicPlayer2.getName() + ", volume: " + musicPlayer2.getVolume());

        context.close();
    }
}
