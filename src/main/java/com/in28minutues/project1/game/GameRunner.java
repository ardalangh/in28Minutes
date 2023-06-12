package com.in28minutues.project1.game;

public class GameRunner  {
    private final GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.printf("Running Game");
    }
}
