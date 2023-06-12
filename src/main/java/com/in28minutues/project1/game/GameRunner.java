package com.in28minutues.project1.game;

public class GameRunner {
    private final MarioGame game;

    public GameRunner(MarioGame marioGame) {
        this.game = marioGame;
    }

    public void run() {
        System.out.printf("Running Game");
    }
}
