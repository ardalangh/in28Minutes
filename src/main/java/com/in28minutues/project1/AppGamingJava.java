package com.in28minutues.project1;

import com.in28minutues.project1.game.GameRunner;
import com.in28minutues.project1.game.MarioGame;

public class AppGamingJava {


    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);

        gameRunner.run();
    }
}
