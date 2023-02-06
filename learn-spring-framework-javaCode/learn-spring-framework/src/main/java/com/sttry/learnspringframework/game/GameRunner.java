package com.sttry.learnspringframework.game;

public class GameRunner {
    // Constructor for MarioGame Class.
//     MarioGame game ;
//     public GameRunner(MarioGame game){
//         this.game = game;
//     }

    // Constructor for superContra class.
//    SuperContra game;
//    public GameRunner(SuperContra game){
//        this.game = game;
//    }

    //Here we create a interface with aal methods which are present in both class and implements in both classes.
    GamingConsole game;
    public GameRunner(GamingConsole game){
        this.game = game;
    }
    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.right();
        game.left();
        game.down();
    }
}
