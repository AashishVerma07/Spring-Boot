package com.sttry.learnspringframework;

import com.sttry.learnspringframework.game.GameRunner;
import com.sttry.learnspringframework.game.MarioGame;
import com.sttry.learnspringframework.game.PacMan;
import com.sttry.learnspringframework.game.SuperContra;

public class AppGamingBasicJava {
    public static void main(String[] args) {

        //create interface object
//        SuperContra game = new SuperContra();

        // Create Mario class abject
//        MarioGame game = new MarioGame();

        // Create PacMan Class object
        PacMan game = new PacMan();

        //Create SuperContra class object.
//        SuperContra superContra = new SuperContra;

        // Create gameRunner class and pass object in arguments.
        GameRunner gameRunner = new GameRunner(game); // Wiring of dependencies.
//        GameRunner gameRunner = new GameRunner(superContra);

        // Call method form GameRunner class.
        gameRunner.run();
    }
}
