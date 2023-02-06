package com.sttry.learnspringframework.game;

public class PacMan implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Sleep");
    }

    @Override
    public void down() {
        System.out.println("WakeUp");

    }

    @Override
    public void right() {
        System.out.println("Running");

    }

    @Override
    public void left() {
        System.out.println("Stop");
    }
}
