package com.in28minutues.project1;

import com.in28minutues.project1.game.GameRunner;
import com.in28minutues.project1.game.SuperMarioGame;

public class App01GamingJava {


    public static void main(String[] args) {
//        var marioGame = new MarioGame();
        var superMarioGame = new SuperMarioGame();
        var gameRunner = new GameRunner(superMarioGame);

        gameRunner.run();
    }
}
