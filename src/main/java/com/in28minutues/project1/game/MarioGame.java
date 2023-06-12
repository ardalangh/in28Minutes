package com.in28minutues.project1.game;

public class MarioGame implements GamingConsole {

    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Goes into a hole");
    }

    public void left() {
        System.out.println("Moves Back");
    }

    public void right() {
        System.out.println("Accelerate");
    }
}
